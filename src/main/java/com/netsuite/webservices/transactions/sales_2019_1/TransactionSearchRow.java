/**
 * TransactionSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class TransactionSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic accountJoin;

    private com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic accountingPeriodJoin;

    private com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchRowBasic accountingTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic advanceToApplyAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic appliedToTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic applyingTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic billingAddressJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic billingTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic binNumberJoin;

    private com.netsuite.webservices.platform.common_2019_1.BomSearchRowBasic bomJoin;

    private com.netsuite.webservices.platform.common_2019_1.BomRevisionSearchRowBasic bomRevisionJoin;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic classJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic cogsPurchaseJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic cogsSaleJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic createdFromJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerMainJoin;

    private com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic departmentJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic depositTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.ExpenseCategorySearchRowBasic expenseCategoryJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic fromLocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic fulfillingTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic headerBillingAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic inventoryDetailJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin;

    private com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic itemNumberJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobMainJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin;

    private com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic lineBillingAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic lineFileJoin;

    private com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic locationJoin;

    private com.netsuite.webservices.platform.common_2019_1.ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntitySearchRowBasic nextApproverJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic paidTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic payingTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic payrollItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic projectTaskJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic purchaseOrderJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic requestorJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic revCommittingTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic revisionJoin;

    private com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchRowBasic revRecScheduleJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic rgPostingTransactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic salesOrderJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin;

    private com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic shippingAddressJoin;

    private com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic subsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic taxCodeJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaxDetailSearchRowBasic taxDetailJoin;

    private com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic taxItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin;

    private com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic toLocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorLineJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public TransactionSearchRow() {
    }

    public TransactionSearchRow(
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic accountJoin,
           com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic accountingPeriodJoin,
           com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchRowBasic accountingTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic advanceToApplyAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic appliedToTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic applyingTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic billingAddressJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic billingTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic binNumberJoin,
           com.netsuite.webservices.platform.common_2019_1.BomSearchRowBasic bomJoin,
           com.netsuite.webservices.platform.common_2019_1.BomRevisionSearchRowBasic bomRevisionJoin,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic classJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic cogsPurchaseJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic cogsSaleJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic createdFromJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerMainJoin,
           com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic departmentJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic depositTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.ExpenseCategorySearchRowBasic expenseCategoryJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic fromLocationJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic fulfillingTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic headerBillingAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic inventoryDetailJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin,
           com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic itemNumberJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobMainJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin,
           com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic lineBillingAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic lineFileJoin,
           com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic locationJoin,
           com.netsuite.webservices.platform.common_2019_1.ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.EntitySearchRowBasic nextApproverJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic paidTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic payingTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic payrollItemJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic projectTaskJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic purchaseOrderJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic requestorJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic revCommittingTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic revisionJoin,
           com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchRowBasic revRecScheduleJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic rgPostingTransactionJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic salesOrderJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin,
           com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic shippingAddressJoin,
           com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic subsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic taxCodeJoin,
           com.netsuite.webservices.platform.common_2019_1.TaxDetailSearchRowBasic taxDetailJoin,
           com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic taxItemJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin,
           com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic toLocationJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorLineJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.accountJoin = accountJoin;
        this.accountingPeriodJoin = accountingPeriodJoin;
        this.accountingTransactionJoin = accountingTransactionJoin;
        this.advanceToApplyAccountJoin = advanceToApplyAccountJoin;
        this.appliedToTransactionJoin = appliedToTransactionJoin;
        this.applyingTransactionJoin = applyingTransactionJoin;
        this.billingAddressJoin = billingAddressJoin;
        this.billingTransactionJoin = billingTransactionJoin;
        this.binNumberJoin = binNumberJoin;
        this.bomJoin = bomJoin;
        this.bomRevisionJoin = bomRevisionJoin;
        this.callJoin = callJoin;
        this.caseJoin = caseJoin;
        this.classJoin = classJoin;
        this.cogsPurchaseJoin = cogsPurchaseJoin;
        this.cogsSaleJoin = cogsSaleJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.createdFromJoin = createdFromJoin;
        this.customerJoin = customerJoin;
        this.customerMainJoin = customerMainJoin;
        this.departmentJoin = departmentJoin;
        this.depositTransactionJoin = depositTransactionJoin;
        this.employeeJoin = employeeJoin;
        this.eventJoin = eventJoin;
        this.expenseCategoryJoin = expenseCategoryJoin;
        this.fileJoin = fileJoin;
        this.fromLocationJoin = fromLocationJoin;
        this.fulfillingTransactionJoin = fulfillingTransactionJoin;
        this.headerBillingAccountJoin = headerBillingAccountJoin;
        this.inventoryDetailJoin = inventoryDetailJoin;
        this.itemJoin = itemJoin;
        this.itemNumberJoin = itemNumberJoin;
        this.jobJoin = jobJoin;
        this.jobMainJoin = jobMainJoin;
        this.leadSourceJoin = leadSourceJoin;
        this.lineBillingAccountJoin = lineBillingAccountJoin;
        this.lineFileJoin = lineFileJoin;
        this.locationJoin = locationJoin;
        this.manufacturingOperationTaskJoin = manufacturingOperationTaskJoin;
        this.messagesJoin = messagesJoin;
        this.nextApproverJoin = nextApproverJoin;
        this.opportunityJoin = opportunityJoin;
        this.paidTransactionJoin = paidTransactionJoin;
        this.partnerJoin = partnerJoin;
        this.payingTransactionJoin = payingTransactionJoin;
        this.payrollItemJoin = payrollItemJoin;
        this.projectTaskJoin = projectTaskJoin;
        this.purchaseOrderJoin = purchaseOrderJoin;
        this.requestorJoin = requestorJoin;
        this.revCommittingTransactionJoin = revCommittingTransactionJoin;
        this.revisionJoin = revisionJoin;
        this.revRecScheduleJoin = revRecScheduleJoin;
        this.rgPostingTransactionJoin = rgPostingTransactionJoin;
        this.salesOrderJoin = salesOrderJoin;
        this.salesRepJoin = salesRepJoin;
        this.shippingAddressJoin = shippingAddressJoin;
        this.subsidiaryJoin = subsidiaryJoin;
        this.taskJoin = taskJoin;
        this.taxCodeJoin = taxCodeJoin;
        this.taxDetailJoin = taxDetailJoin;
        this.taxItemJoin = taxItemJoin;
        this.timeJoin = timeJoin;
        this.toLocationJoin = toLocationJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
        this.vendorLineJoin = vendorLineJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this TransactionSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this TransactionSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the accountJoin value for this TransactionSearchRow.
     * 
     * @return accountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }


    /**
     * Sets the accountJoin value for this TransactionSearchRow.
     * 
     * @param accountJoin
     */
    public void setAccountJoin(com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic accountJoin) {
        this.accountJoin = accountJoin;
    }


    /**
     * Gets the accountingPeriodJoin value for this TransactionSearchRow.
     * 
     * @return accountingPeriodJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic getAccountingPeriodJoin() {
        return accountingPeriodJoin;
    }


    /**
     * Sets the accountingPeriodJoin value for this TransactionSearchRow.
     * 
     * @param accountingPeriodJoin
     */
    public void setAccountingPeriodJoin(com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic accountingPeriodJoin) {
        this.accountingPeriodJoin = accountingPeriodJoin;
    }


    /**
     * Gets the accountingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return accountingTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchRowBasic getAccountingTransactionJoin() {
        return accountingTransactionJoin;
    }


    /**
     * Sets the accountingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param accountingTransactionJoin
     */
    public void setAccountingTransactionJoin(com.netsuite.webservices.platform.common_2019_1.AccountingTransactionSearchRowBasic accountingTransactionJoin) {
        this.accountingTransactionJoin = accountingTransactionJoin;
    }


    /**
     * Gets the advanceToApplyAccountJoin value for this TransactionSearchRow.
     * 
     * @return advanceToApplyAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic getAdvanceToApplyAccountJoin() {
        return advanceToApplyAccountJoin;
    }


    /**
     * Sets the advanceToApplyAccountJoin value for this TransactionSearchRow.
     * 
     * @param advanceToApplyAccountJoin
     */
    public void setAdvanceToApplyAccountJoin(com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic advanceToApplyAccountJoin) {
        this.advanceToApplyAccountJoin = advanceToApplyAccountJoin;
    }


    /**
     * Gets the appliedToTransactionJoin value for this TransactionSearchRow.
     * 
     * @return appliedToTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }


    /**
     * Sets the appliedToTransactionJoin value for this TransactionSearchRow.
     * 
     * @param appliedToTransactionJoin
     */
    public void setAppliedToTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic appliedToTransactionJoin) {
        this.appliedToTransactionJoin = appliedToTransactionJoin;
    }


    /**
     * Gets the applyingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return applyingTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getApplyingTransactionJoin() {
        return applyingTransactionJoin;
    }


    /**
     * Sets the applyingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param applyingTransactionJoin
     */
    public void setApplyingTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic applyingTransactionJoin) {
        this.applyingTransactionJoin = applyingTransactionJoin;
    }


    /**
     * Gets the billingAddressJoin value for this TransactionSearchRow.
     * 
     * @return billingAddressJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic getBillingAddressJoin() {
        return billingAddressJoin;
    }


    /**
     * Sets the billingAddressJoin value for this TransactionSearchRow.
     * 
     * @param billingAddressJoin
     */
    public void setBillingAddressJoin(com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic billingAddressJoin) {
        this.billingAddressJoin = billingAddressJoin;
    }


    /**
     * Gets the billingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return billingTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getBillingTransactionJoin() {
        return billingTransactionJoin;
    }


    /**
     * Sets the billingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param billingTransactionJoin
     */
    public void setBillingTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic billingTransactionJoin) {
        this.billingTransactionJoin = billingTransactionJoin;
    }


    /**
     * Gets the binNumberJoin value for this TransactionSearchRow.
     * 
     * @return binNumberJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }


    /**
     * Sets the binNumberJoin value for this TransactionSearchRow.
     * 
     * @param binNumberJoin
     */
    public void setBinNumberJoin(com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }


    /**
     * Gets the bomJoin value for this TransactionSearchRow.
     * 
     * @return bomJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BomSearchRowBasic getBomJoin() {
        return bomJoin;
    }


    /**
     * Sets the bomJoin value for this TransactionSearchRow.
     * 
     * @param bomJoin
     */
    public void setBomJoin(com.netsuite.webservices.platform.common_2019_1.BomSearchRowBasic bomJoin) {
        this.bomJoin = bomJoin;
    }


    /**
     * Gets the bomRevisionJoin value for this TransactionSearchRow.
     * 
     * @return bomRevisionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BomRevisionSearchRowBasic getBomRevisionJoin() {
        return bomRevisionJoin;
    }


    /**
     * Sets the bomRevisionJoin value for this TransactionSearchRow.
     * 
     * @param bomRevisionJoin
     */
    public void setBomRevisionJoin(com.netsuite.webservices.platform.common_2019_1.BomRevisionSearchRowBasic bomRevisionJoin) {
        this.bomRevisionJoin = bomRevisionJoin;
    }


    /**
     * Gets the callJoin value for this TransactionSearchRow.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this TransactionSearchRow.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the caseJoin value for this TransactionSearchRow.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this TransactionSearchRow.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the classJoin value for this TransactionSearchRow.
     * 
     * @return classJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }


    /**
     * Sets the classJoin value for this TransactionSearchRow.
     * 
     * @param classJoin
     */
    public void setClassJoin(com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic classJoin) {
        this.classJoin = classJoin;
    }


    /**
     * Gets the cogsPurchaseJoin value for this TransactionSearchRow.
     * 
     * @return cogsPurchaseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getCogsPurchaseJoin() {
        return cogsPurchaseJoin;
    }


    /**
     * Sets the cogsPurchaseJoin value for this TransactionSearchRow.
     * 
     * @param cogsPurchaseJoin
     */
    public void setCogsPurchaseJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic cogsPurchaseJoin) {
        this.cogsPurchaseJoin = cogsPurchaseJoin;
    }


    /**
     * Gets the cogsSaleJoin value for this TransactionSearchRow.
     * 
     * @return cogsSaleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getCogsSaleJoin() {
        return cogsSaleJoin;
    }


    /**
     * Sets the cogsSaleJoin value for this TransactionSearchRow.
     * 
     * @param cogsSaleJoin
     */
    public void setCogsSaleJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic cogsSaleJoin) {
        this.cogsSaleJoin = cogsSaleJoin;
    }


    /**
     * Gets the contactPrimaryJoin value for this TransactionSearchRow.
     * 
     * @return contactPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }


    /**
     * Sets the contactPrimaryJoin value for this TransactionSearchRow.
     * 
     * @param contactPrimaryJoin
     */
    public void setContactPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }


    /**
     * Gets the createdFromJoin value for this TransactionSearchRow.
     * 
     * @return createdFromJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getCreatedFromJoin() {
        return createdFromJoin;
    }


    /**
     * Sets the createdFromJoin value for this TransactionSearchRow.
     * 
     * @param createdFromJoin
     */
    public void setCreatedFromJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic createdFromJoin) {
        this.createdFromJoin = createdFromJoin;
    }


    /**
     * Gets the customerJoin value for this TransactionSearchRow.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this TransactionSearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the customerMainJoin value for this TransactionSearchRow.
     * 
     * @return customerMainJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerMainJoin() {
        return customerMainJoin;
    }


    /**
     * Sets the customerMainJoin value for this TransactionSearchRow.
     * 
     * @param customerMainJoin
     */
    public void setCustomerMainJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerMainJoin) {
        this.customerMainJoin = customerMainJoin;
    }


    /**
     * Gets the departmentJoin value for this TransactionSearchRow.
     * 
     * @return departmentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }


    /**
     * Sets the departmentJoin value for this TransactionSearchRow.
     * 
     * @param departmentJoin
     */
    public void setDepartmentJoin(com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }


    /**
     * Gets the depositTransactionJoin value for this TransactionSearchRow.
     * 
     * @return depositTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getDepositTransactionJoin() {
        return depositTransactionJoin;
    }


    /**
     * Sets the depositTransactionJoin value for this TransactionSearchRow.
     * 
     * @param depositTransactionJoin
     */
    public void setDepositTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic depositTransactionJoin) {
        this.depositTransactionJoin = depositTransactionJoin;
    }


    /**
     * Gets the employeeJoin value for this TransactionSearchRow.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this TransactionSearchRow.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the eventJoin value for this TransactionSearchRow.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this TransactionSearchRow.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the expenseCategoryJoin value for this TransactionSearchRow.
     * 
     * @return expenseCategoryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ExpenseCategorySearchRowBasic getExpenseCategoryJoin() {
        return expenseCategoryJoin;
    }


    /**
     * Sets the expenseCategoryJoin value for this TransactionSearchRow.
     * 
     * @param expenseCategoryJoin
     */
    public void setExpenseCategoryJoin(com.netsuite.webservices.platform.common_2019_1.ExpenseCategorySearchRowBasic expenseCategoryJoin) {
        this.expenseCategoryJoin = expenseCategoryJoin;
    }


    /**
     * Gets the fileJoin value for this TransactionSearchRow.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this TransactionSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the fromLocationJoin value for this TransactionSearchRow.
     * 
     * @return fromLocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic getFromLocationJoin() {
        return fromLocationJoin;
    }


    /**
     * Sets the fromLocationJoin value for this TransactionSearchRow.
     * 
     * @param fromLocationJoin
     */
    public void setFromLocationJoin(com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic fromLocationJoin) {
        this.fromLocationJoin = fromLocationJoin;
    }


    /**
     * Gets the fulfillingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return fulfillingTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getFulfillingTransactionJoin() {
        return fulfillingTransactionJoin;
    }


    /**
     * Sets the fulfillingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param fulfillingTransactionJoin
     */
    public void setFulfillingTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic fulfillingTransactionJoin) {
        this.fulfillingTransactionJoin = fulfillingTransactionJoin;
    }


    /**
     * Gets the headerBillingAccountJoin value for this TransactionSearchRow.
     * 
     * @return headerBillingAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic getHeaderBillingAccountJoin() {
        return headerBillingAccountJoin;
    }


    /**
     * Sets the headerBillingAccountJoin value for this TransactionSearchRow.
     * 
     * @param headerBillingAccountJoin
     */
    public void setHeaderBillingAccountJoin(com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic headerBillingAccountJoin) {
        this.headerBillingAccountJoin = headerBillingAccountJoin;
    }


    /**
     * Gets the inventoryDetailJoin value for this TransactionSearchRow.
     * 
     * @return inventoryDetailJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }


    /**
     * Sets the inventoryDetailJoin value for this TransactionSearchRow.
     * 
     * @param inventoryDetailJoin
     */
    public void setInventoryDetailJoin(com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic inventoryDetailJoin) {
        this.inventoryDetailJoin = inventoryDetailJoin;
    }


    /**
     * Gets the itemJoin value for this TransactionSearchRow.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this TransactionSearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the itemNumberJoin value for this TransactionSearchRow.
     * 
     * @return itemNumberJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic getItemNumberJoin() {
        return itemNumberJoin;
    }


    /**
     * Sets the itemNumberJoin value for this TransactionSearchRow.
     * 
     * @param itemNumberJoin
     */
    public void setItemNumberJoin(com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic itemNumberJoin) {
        this.itemNumberJoin = itemNumberJoin;
    }


    /**
     * Gets the jobJoin value for this TransactionSearchRow.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this TransactionSearchRow.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the jobMainJoin value for this TransactionSearchRow.
     * 
     * @return jobMainJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getJobMainJoin() {
        return jobMainJoin;
    }


    /**
     * Sets the jobMainJoin value for this TransactionSearchRow.
     * 
     * @param jobMainJoin
     */
    public void setJobMainJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobMainJoin) {
        this.jobMainJoin = jobMainJoin;
    }


    /**
     * Gets the leadSourceJoin value for this TransactionSearchRow.
     * 
     * @return leadSourceJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }


    /**
     * Sets the leadSourceJoin value for this TransactionSearchRow.
     * 
     * @param leadSourceJoin
     */
    public void setLeadSourceJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
    }


    /**
     * Gets the lineBillingAccountJoin value for this TransactionSearchRow.
     * 
     * @return lineBillingAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic getLineBillingAccountJoin() {
        return lineBillingAccountJoin;
    }


    /**
     * Sets the lineBillingAccountJoin value for this TransactionSearchRow.
     * 
     * @param lineBillingAccountJoin
     */
    public void setLineBillingAccountJoin(com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic lineBillingAccountJoin) {
        this.lineBillingAccountJoin = lineBillingAccountJoin;
    }


    /**
     * Gets the lineFileJoin value for this TransactionSearchRow.
     * 
     * @return lineFileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getLineFileJoin() {
        return lineFileJoin;
    }


    /**
     * Sets the lineFileJoin value for this TransactionSearchRow.
     * 
     * @param lineFileJoin
     */
    public void setLineFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic lineFileJoin) {
        this.lineFileJoin = lineFileJoin;
    }


    /**
     * Gets the locationJoin value for this TransactionSearchRow.
     * 
     * @return locationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }


    /**
     * Sets the locationJoin value for this TransactionSearchRow.
     * 
     * @param locationJoin
     */
    public void setLocationJoin(com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }


    /**
     * Gets the manufacturingOperationTaskJoin value for this TransactionSearchRow.
     * 
     * @return manufacturingOperationTaskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ManufacturingOperationTaskSearchRowBasic getManufacturingOperationTaskJoin() {
        return manufacturingOperationTaskJoin;
    }


    /**
     * Sets the manufacturingOperationTaskJoin value for this TransactionSearchRow.
     * 
     * @param manufacturingOperationTaskJoin
     */
    public void setManufacturingOperationTaskJoin(com.netsuite.webservices.platform.common_2019_1.ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin) {
        this.manufacturingOperationTaskJoin = manufacturingOperationTaskJoin;
    }


    /**
     * Gets the messagesJoin value for this TransactionSearchRow.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this TransactionSearchRow.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the nextApproverJoin value for this TransactionSearchRow.
     * 
     * @return nextApproverJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntitySearchRowBasic getNextApproverJoin() {
        return nextApproverJoin;
    }


    /**
     * Sets the nextApproverJoin value for this TransactionSearchRow.
     * 
     * @param nextApproverJoin
     */
    public void setNextApproverJoin(com.netsuite.webservices.platform.common_2019_1.EntitySearchRowBasic nextApproverJoin) {
        this.nextApproverJoin = nextApproverJoin;
    }


    /**
     * Gets the opportunityJoin value for this TransactionSearchRow.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this TransactionSearchRow.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the paidTransactionJoin value for this TransactionSearchRow.
     * 
     * @return paidTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getPaidTransactionJoin() {
        return paidTransactionJoin;
    }


    /**
     * Sets the paidTransactionJoin value for this TransactionSearchRow.
     * 
     * @param paidTransactionJoin
     */
    public void setPaidTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic paidTransactionJoin) {
        this.paidTransactionJoin = paidTransactionJoin;
    }


    /**
     * Gets the partnerJoin value for this TransactionSearchRow.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this TransactionSearchRow.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the payingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return payingTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getPayingTransactionJoin() {
        return payingTransactionJoin;
    }


    /**
     * Sets the payingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param payingTransactionJoin
     */
    public void setPayingTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic payingTransactionJoin) {
        this.payingTransactionJoin = payingTransactionJoin;
    }


    /**
     * Gets the payrollItemJoin value for this TransactionSearchRow.
     * 
     * @return payrollItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }


    /**
     * Sets the payrollItemJoin value for this TransactionSearchRow.
     * 
     * @param payrollItemJoin
     */
    public void setPayrollItemJoin(com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic payrollItemJoin) {
        this.payrollItemJoin = payrollItemJoin;
    }


    /**
     * Gets the projectTaskJoin value for this TransactionSearchRow.
     * 
     * @return projectTaskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }


    /**
     * Sets the projectTaskJoin value for this TransactionSearchRow.
     * 
     * @param projectTaskJoin
     */
    public void setProjectTaskJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }


    /**
     * Gets the purchaseOrderJoin value for this TransactionSearchRow.
     * 
     * @return purchaseOrderJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }


    /**
     * Sets the purchaseOrderJoin value for this TransactionSearchRow.
     * 
     * @param purchaseOrderJoin
     */
    public void setPurchaseOrderJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic purchaseOrderJoin) {
        this.purchaseOrderJoin = purchaseOrderJoin;
    }


    /**
     * Gets the requestorJoin value for this TransactionSearchRow.
     * 
     * @return requestorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getRequestorJoin() {
        return requestorJoin;
    }


    /**
     * Sets the requestorJoin value for this TransactionSearchRow.
     * 
     * @param requestorJoin
     */
    public void setRequestorJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic requestorJoin) {
        this.requestorJoin = requestorJoin;
    }


    /**
     * Gets the revCommittingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return revCommittingTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getRevCommittingTransactionJoin() {
        return revCommittingTransactionJoin;
    }


    /**
     * Sets the revCommittingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param revCommittingTransactionJoin
     */
    public void setRevCommittingTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic revCommittingTransactionJoin) {
        this.revCommittingTransactionJoin = revCommittingTransactionJoin;
    }


    /**
     * Gets the revisionJoin value for this TransactionSearchRow.
     * 
     * @return revisionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic getRevisionJoin() {
        return revisionJoin;
    }


    /**
     * Sets the revisionJoin value for this TransactionSearchRow.
     * 
     * @param revisionJoin
     */
    public void setRevisionJoin(com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic revisionJoin) {
        this.revisionJoin = revisionJoin;
    }


    /**
     * Gets the revRecScheduleJoin value for this TransactionSearchRow.
     * 
     * @return revRecScheduleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchRowBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }


    /**
     * Sets the revRecScheduleJoin value for this TransactionSearchRow.
     * 
     * @param revRecScheduleJoin
     */
    public void setRevRecScheduleJoin(com.netsuite.webservices.platform.common_2019_1.RevRecScheduleSearchRowBasic revRecScheduleJoin) {
        this.revRecScheduleJoin = revRecScheduleJoin;
    }


    /**
     * Gets the rgPostingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return rgPostingTransactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getRgPostingTransactionJoin() {
        return rgPostingTransactionJoin;
    }


    /**
     * Sets the rgPostingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param rgPostingTransactionJoin
     */
    public void setRgPostingTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic rgPostingTransactionJoin) {
        this.rgPostingTransactionJoin = rgPostingTransactionJoin;
    }


    /**
     * Gets the salesOrderJoin value for this TransactionSearchRow.
     * 
     * @return salesOrderJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }


    /**
     * Sets the salesOrderJoin value for this TransactionSearchRow.
     * 
     * @param salesOrderJoin
     */
    public void setSalesOrderJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic salesOrderJoin) {
        this.salesOrderJoin = salesOrderJoin;
    }


    /**
     * Gets the salesRepJoin value for this TransactionSearchRow.
     * 
     * @return salesRepJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getSalesRepJoin() {
        return salesRepJoin;
    }


    /**
     * Sets the salesRepJoin value for this TransactionSearchRow.
     * 
     * @param salesRepJoin
     */
    public void setSalesRepJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }


    /**
     * Gets the shippingAddressJoin value for this TransactionSearchRow.
     * 
     * @return shippingAddressJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic getShippingAddressJoin() {
        return shippingAddressJoin;
    }


    /**
     * Sets the shippingAddressJoin value for this TransactionSearchRow.
     * 
     * @param shippingAddressJoin
     */
    public void setShippingAddressJoin(com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic shippingAddressJoin) {
        this.shippingAddressJoin = shippingAddressJoin;
    }


    /**
     * Gets the subsidiaryJoin value for this TransactionSearchRow.
     * 
     * @return subsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }


    /**
     * Sets the subsidiaryJoin value for this TransactionSearchRow.
     * 
     * @param subsidiaryJoin
     */
    public void setSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic subsidiaryJoin) {
        this.subsidiaryJoin = subsidiaryJoin;
    }


    /**
     * Gets the taskJoin value for this TransactionSearchRow.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this TransactionSearchRow.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the taxCodeJoin value for this TransactionSearchRow.
     * 
     * @return taxCodeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic getTaxCodeJoin() {
        return taxCodeJoin;
    }


    /**
     * Sets the taxCodeJoin value for this TransactionSearchRow.
     * 
     * @param taxCodeJoin
     */
    public void setTaxCodeJoin(com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic taxCodeJoin) {
        this.taxCodeJoin = taxCodeJoin;
    }


    /**
     * Gets the taxDetailJoin value for this TransactionSearchRow.
     * 
     * @return taxDetailJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaxDetailSearchRowBasic getTaxDetailJoin() {
        return taxDetailJoin;
    }


    /**
     * Sets the taxDetailJoin value for this TransactionSearchRow.
     * 
     * @param taxDetailJoin
     */
    public void setTaxDetailJoin(com.netsuite.webservices.platform.common_2019_1.TaxDetailSearchRowBasic taxDetailJoin) {
        this.taxDetailJoin = taxDetailJoin;
    }


    /**
     * Gets the taxItemJoin value for this TransactionSearchRow.
     * 
     * @return taxItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic getTaxItemJoin() {
        return taxItemJoin;
    }


    /**
     * Sets the taxItemJoin value for this TransactionSearchRow.
     * 
     * @param taxItemJoin
     */
    public void setTaxItemJoin(com.netsuite.webservices.platform.common_2019_1.SalesTaxItemSearchRowBasic taxItemJoin) {
        this.taxItemJoin = taxItemJoin;
    }


    /**
     * Gets the timeJoin value for this TransactionSearchRow.
     * 
     * @return timeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this TransactionSearchRow.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the toLocationJoin value for this TransactionSearchRow.
     * 
     * @return toLocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic getToLocationJoin() {
        return toLocationJoin;
    }


    /**
     * Sets the toLocationJoin value for this TransactionSearchRow.
     * 
     * @param toLocationJoin
     */
    public void setToLocationJoin(com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic toLocationJoin) {
        this.toLocationJoin = toLocationJoin;
    }


    /**
     * Gets the userJoin value for this TransactionSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this TransactionSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this TransactionSearchRow.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this TransactionSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the vendorJoin value for this TransactionSearchRow.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this TransactionSearchRow.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the vendorLineJoin value for this TransactionSearchRow.
     * 
     * @return vendorLineJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getVendorLineJoin() {
        return vendorLineJoin;
    }


    /**
     * Sets the vendorLineJoin value for this TransactionSearchRow.
     * 
     * @param vendorLineJoin
     */
    public void setVendorLineJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorLineJoin) {
        this.vendorLineJoin = vendorLineJoin;
    }


    /**
     * Gets the customSearchJoin value for this TransactionSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this TransactionSearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchRow)) return false;
        TransactionSearchRow other = (TransactionSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.accountJoin==null && other.getAccountJoin()==null) || 
             (this.accountJoin!=null &&
              this.accountJoin.equals(other.getAccountJoin()))) &&
            ((this.accountingPeriodJoin==null && other.getAccountingPeriodJoin()==null) || 
             (this.accountingPeriodJoin!=null &&
              this.accountingPeriodJoin.equals(other.getAccountingPeriodJoin()))) &&
            ((this.accountingTransactionJoin==null && other.getAccountingTransactionJoin()==null) || 
             (this.accountingTransactionJoin!=null &&
              this.accountingTransactionJoin.equals(other.getAccountingTransactionJoin()))) &&
            ((this.advanceToApplyAccountJoin==null && other.getAdvanceToApplyAccountJoin()==null) || 
             (this.advanceToApplyAccountJoin!=null &&
              this.advanceToApplyAccountJoin.equals(other.getAdvanceToApplyAccountJoin()))) &&
            ((this.appliedToTransactionJoin==null && other.getAppliedToTransactionJoin()==null) || 
             (this.appliedToTransactionJoin!=null &&
              this.appliedToTransactionJoin.equals(other.getAppliedToTransactionJoin()))) &&
            ((this.applyingTransactionJoin==null && other.getApplyingTransactionJoin()==null) || 
             (this.applyingTransactionJoin!=null &&
              this.applyingTransactionJoin.equals(other.getApplyingTransactionJoin()))) &&
            ((this.billingAddressJoin==null && other.getBillingAddressJoin()==null) || 
             (this.billingAddressJoin!=null &&
              this.billingAddressJoin.equals(other.getBillingAddressJoin()))) &&
            ((this.billingTransactionJoin==null && other.getBillingTransactionJoin()==null) || 
             (this.billingTransactionJoin!=null &&
              this.billingTransactionJoin.equals(other.getBillingTransactionJoin()))) &&
            ((this.binNumberJoin==null && other.getBinNumberJoin()==null) || 
             (this.binNumberJoin!=null &&
              this.binNumberJoin.equals(other.getBinNumberJoin()))) &&
            ((this.bomJoin==null && other.getBomJoin()==null) || 
             (this.bomJoin!=null &&
              this.bomJoin.equals(other.getBomJoin()))) &&
            ((this.bomRevisionJoin==null && other.getBomRevisionJoin()==null) || 
             (this.bomRevisionJoin!=null &&
              this.bomRevisionJoin.equals(other.getBomRevisionJoin()))) &&
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.classJoin==null && other.getClassJoin()==null) || 
             (this.classJoin!=null &&
              this.classJoin.equals(other.getClassJoin()))) &&
            ((this.cogsPurchaseJoin==null && other.getCogsPurchaseJoin()==null) || 
             (this.cogsPurchaseJoin!=null &&
              this.cogsPurchaseJoin.equals(other.getCogsPurchaseJoin()))) &&
            ((this.cogsSaleJoin==null && other.getCogsSaleJoin()==null) || 
             (this.cogsSaleJoin!=null &&
              this.cogsSaleJoin.equals(other.getCogsSaleJoin()))) &&
            ((this.contactPrimaryJoin==null && other.getContactPrimaryJoin()==null) || 
             (this.contactPrimaryJoin!=null &&
              this.contactPrimaryJoin.equals(other.getContactPrimaryJoin()))) &&
            ((this.createdFromJoin==null && other.getCreatedFromJoin()==null) || 
             (this.createdFromJoin!=null &&
              this.createdFromJoin.equals(other.getCreatedFromJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.customerMainJoin==null && other.getCustomerMainJoin()==null) || 
             (this.customerMainJoin!=null &&
              this.customerMainJoin.equals(other.getCustomerMainJoin()))) &&
            ((this.departmentJoin==null && other.getDepartmentJoin()==null) || 
             (this.departmentJoin!=null &&
              this.departmentJoin.equals(other.getDepartmentJoin()))) &&
            ((this.depositTransactionJoin==null && other.getDepositTransactionJoin()==null) || 
             (this.depositTransactionJoin!=null &&
              this.depositTransactionJoin.equals(other.getDepositTransactionJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.expenseCategoryJoin==null && other.getExpenseCategoryJoin()==null) || 
             (this.expenseCategoryJoin!=null &&
              this.expenseCategoryJoin.equals(other.getExpenseCategoryJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.fromLocationJoin==null && other.getFromLocationJoin()==null) || 
             (this.fromLocationJoin!=null &&
              this.fromLocationJoin.equals(other.getFromLocationJoin()))) &&
            ((this.fulfillingTransactionJoin==null && other.getFulfillingTransactionJoin()==null) || 
             (this.fulfillingTransactionJoin!=null &&
              this.fulfillingTransactionJoin.equals(other.getFulfillingTransactionJoin()))) &&
            ((this.headerBillingAccountJoin==null && other.getHeaderBillingAccountJoin()==null) || 
             (this.headerBillingAccountJoin!=null &&
              this.headerBillingAccountJoin.equals(other.getHeaderBillingAccountJoin()))) &&
            ((this.inventoryDetailJoin==null && other.getInventoryDetailJoin()==null) || 
             (this.inventoryDetailJoin!=null &&
              this.inventoryDetailJoin.equals(other.getInventoryDetailJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.itemNumberJoin==null && other.getItemNumberJoin()==null) || 
             (this.itemNumberJoin!=null &&
              this.itemNumberJoin.equals(other.getItemNumberJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.jobMainJoin==null && other.getJobMainJoin()==null) || 
             (this.jobMainJoin!=null &&
              this.jobMainJoin.equals(other.getJobMainJoin()))) &&
            ((this.leadSourceJoin==null && other.getLeadSourceJoin()==null) || 
             (this.leadSourceJoin!=null &&
              this.leadSourceJoin.equals(other.getLeadSourceJoin()))) &&
            ((this.lineBillingAccountJoin==null && other.getLineBillingAccountJoin()==null) || 
             (this.lineBillingAccountJoin!=null &&
              this.lineBillingAccountJoin.equals(other.getLineBillingAccountJoin()))) &&
            ((this.lineFileJoin==null && other.getLineFileJoin()==null) || 
             (this.lineFileJoin!=null &&
              this.lineFileJoin.equals(other.getLineFileJoin()))) &&
            ((this.locationJoin==null && other.getLocationJoin()==null) || 
             (this.locationJoin!=null &&
              this.locationJoin.equals(other.getLocationJoin()))) &&
            ((this.manufacturingOperationTaskJoin==null && other.getManufacturingOperationTaskJoin()==null) || 
             (this.manufacturingOperationTaskJoin!=null &&
              this.manufacturingOperationTaskJoin.equals(other.getManufacturingOperationTaskJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.nextApproverJoin==null && other.getNextApproverJoin()==null) || 
             (this.nextApproverJoin!=null &&
              this.nextApproverJoin.equals(other.getNextApproverJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.paidTransactionJoin==null && other.getPaidTransactionJoin()==null) || 
             (this.paidTransactionJoin!=null &&
              this.paidTransactionJoin.equals(other.getPaidTransactionJoin()))) &&
            ((this.partnerJoin==null && other.getPartnerJoin()==null) || 
             (this.partnerJoin!=null &&
              this.partnerJoin.equals(other.getPartnerJoin()))) &&
            ((this.payingTransactionJoin==null && other.getPayingTransactionJoin()==null) || 
             (this.payingTransactionJoin!=null &&
              this.payingTransactionJoin.equals(other.getPayingTransactionJoin()))) &&
            ((this.payrollItemJoin==null && other.getPayrollItemJoin()==null) || 
             (this.payrollItemJoin!=null &&
              this.payrollItemJoin.equals(other.getPayrollItemJoin()))) &&
            ((this.projectTaskJoin==null && other.getProjectTaskJoin()==null) || 
             (this.projectTaskJoin!=null &&
              this.projectTaskJoin.equals(other.getProjectTaskJoin()))) &&
            ((this.purchaseOrderJoin==null && other.getPurchaseOrderJoin()==null) || 
             (this.purchaseOrderJoin!=null &&
              this.purchaseOrderJoin.equals(other.getPurchaseOrderJoin()))) &&
            ((this.requestorJoin==null && other.getRequestorJoin()==null) || 
             (this.requestorJoin!=null &&
              this.requestorJoin.equals(other.getRequestorJoin()))) &&
            ((this.revCommittingTransactionJoin==null && other.getRevCommittingTransactionJoin()==null) || 
             (this.revCommittingTransactionJoin!=null &&
              this.revCommittingTransactionJoin.equals(other.getRevCommittingTransactionJoin()))) &&
            ((this.revisionJoin==null && other.getRevisionJoin()==null) || 
             (this.revisionJoin!=null &&
              this.revisionJoin.equals(other.getRevisionJoin()))) &&
            ((this.revRecScheduleJoin==null && other.getRevRecScheduleJoin()==null) || 
             (this.revRecScheduleJoin!=null &&
              this.revRecScheduleJoin.equals(other.getRevRecScheduleJoin()))) &&
            ((this.rgPostingTransactionJoin==null && other.getRgPostingTransactionJoin()==null) || 
             (this.rgPostingTransactionJoin!=null &&
              this.rgPostingTransactionJoin.equals(other.getRgPostingTransactionJoin()))) &&
            ((this.salesOrderJoin==null && other.getSalesOrderJoin()==null) || 
             (this.salesOrderJoin!=null &&
              this.salesOrderJoin.equals(other.getSalesOrderJoin()))) &&
            ((this.salesRepJoin==null && other.getSalesRepJoin()==null) || 
             (this.salesRepJoin!=null &&
              this.salesRepJoin.equals(other.getSalesRepJoin()))) &&
            ((this.shippingAddressJoin==null && other.getShippingAddressJoin()==null) || 
             (this.shippingAddressJoin!=null &&
              this.shippingAddressJoin.equals(other.getShippingAddressJoin()))) &&
            ((this.subsidiaryJoin==null && other.getSubsidiaryJoin()==null) || 
             (this.subsidiaryJoin!=null &&
              this.subsidiaryJoin.equals(other.getSubsidiaryJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.taxCodeJoin==null && other.getTaxCodeJoin()==null) || 
             (this.taxCodeJoin!=null &&
              this.taxCodeJoin.equals(other.getTaxCodeJoin()))) &&
            ((this.taxDetailJoin==null && other.getTaxDetailJoin()==null) || 
             (this.taxDetailJoin!=null &&
              this.taxDetailJoin.equals(other.getTaxDetailJoin()))) &&
            ((this.taxItemJoin==null && other.getTaxItemJoin()==null) || 
             (this.taxItemJoin!=null &&
              this.taxItemJoin.equals(other.getTaxItemJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
            ((this.toLocationJoin==null && other.getToLocationJoin()==null) || 
             (this.toLocationJoin!=null &&
              this.toLocationJoin.equals(other.getToLocationJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin()))) &&
            ((this.vendorLineJoin==null && other.getVendorLineJoin()==null) || 
             (this.vendorLineJoin!=null &&
              this.vendorLineJoin.equals(other.getVendorLineJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getAccountJoin() != null) {
            _hashCode += getAccountJoin().hashCode();
        }
        if (getAccountingPeriodJoin() != null) {
            _hashCode += getAccountingPeriodJoin().hashCode();
        }
        if (getAccountingTransactionJoin() != null) {
            _hashCode += getAccountingTransactionJoin().hashCode();
        }
        if (getAdvanceToApplyAccountJoin() != null) {
            _hashCode += getAdvanceToApplyAccountJoin().hashCode();
        }
        if (getAppliedToTransactionJoin() != null) {
            _hashCode += getAppliedToTransactionJoin().hashCode();
        }
        if (getApplyingTransactionJoin() != null) {
            _hashCode += getApplyingTransactionJoin().hashCode();
        }
        if (getBillingAddressJoin() != null) {
            _hashCode += getBillingAddressJoin().hashCode();
        }
        if (getBillingTransactionJoin() != null) {
            _hashCode += getBillingTransactionJoin().hashCode();
        }
        if (getBinNumberJoin() != null) {
            _hashCode += getBinNumberJoin().hashCode();
        }
        if (getBomJoin() != null) {
            _hashCode += getBomJoin().hashCode();
        }
        if (getBomRevisionJoin() != null) {
            _hashCode += getBomRevisionJoin().hashCode();
        }
        if (getCallJoin() != null) {
            _hashCode += getCallJoin().hashCode();
        }
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getClassJoin() != null) {
            _hashCode += getClassJoin().hashCode();
        }
        if (getCogsPurchaseJoin() != null) {
            _hashCode += getCogsPurchaseJoin().hashCode();
        }
        if (getCogsSaleJoin() != null) {
            _hashCode += getCogsSaleJoin().hashCode();
        }
        if (getContactPrimaryJoin() != null) {
            _hashCode += getContactPrimaryJoin().hashCode();
        }
        if (getCreatedFromJoin() != null) {
            _hashCode += getCreatedFromJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getCustomerMainJoin() != null) {
            _hashCode += getCustomerMainJoin().hashCode();
        }
        if (getDepartmentJoin() != null) {
            _hashCode += getDepartmentJoin().hashCode();
        }
        if (getDepositTransactionJoin() != null) {
            _hashCode += getDepositTransactionJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getExpenseCategoryJoin() != null) {
            _hashCode += getExpenseCategoryJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getFromLocationJoin() != null) {
            _hashCode += getFromLocationJoin().hashCode();
        }
        if (getFulfillingTransactionJoin() != null) {
            _hashCode += getFulfillingTransactionJoin().hashCode();
        }
        if (getHeaderBillingAccountJoin() != null) {
            _hashCode += getHeaderBillingAccountJoin().hashCode();
        }
        if (getInventoryDetailJoin() != null) {
            _hashCode += getInventoryDetailJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getItemNumberJoin() != null) {
            _hashCode += getItemNumberJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getJobMainJoin() != null) {
            _hashCode += getJobMainJoin().hashCode();
        }
        if (getLeadSourceJoin() != null) {
            _hashCode += getLeadSourceJoin().hashCode();
        }
        if (getLineBillingAccountJoin() != null) {
            _hashCode += getLineBillingAccountJoin().hashCode();
        }
        if (getLineFileJoin() != null) {
            _hashCode += getLineFileJoin().hashCode();
        }
        if (getLocationJoin() != null) {
            _hashCode += getLocationJoin().hashCode();
        }
        if (getManufacturingOperationTaskJoin() != null) {
            _hashCode += getManufacturingOperationTaskJoin().hashCode();
        }
        if (getMessagesJoin() != null) {
            _hashCode += getMessagesJoin().hashCode();
        }
        if (getNextApproverJoin() != null) {
            _hashCode += getNextApproverJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getPaidTransactionJoin() != null) {
            _hashCode += getPaidTransactionJoin().hashCode();
        }
        if (getPartnerJoin() != null) {
            _hashCode += getPartnerJoin().hashCode();
        }
        if (getPayingTransactionJoin() != null) {
            _hashCode += getPayingTransactionJoin().hashCode();
        }
        if (getPayrollItemJoin() != null) {
            _hashCode += getPayrollItemJoin().hashCode();
        }
        if (getProjectTaskJoin() != null) {
            _hashCode += getProjectTaskJoin().hashCode();
        }
        if (getPurchaseOrderJoin() != null) {
            _hashCode += getPurchaseOrderJoin().hashCode();
        }
        if (getRequestorJoin() != null) {
            _hashCode += getRequestorJoin().hashCode();
        }
        if (getRevCommittingTransactionJoin() != null) {
            _hashCode += getRevCommittingTransactionJoin().hashCode();
        }
        if (getRevisionJoin() != null) {
            _hashCode += getRevisionJoin().hashCode();
        }
        if (getRevRecScheduleJoin() != null) {
            _hashCode += getRevRecScheduleJoin().hashCode();
        }
        if (getRgPostingTransactionJoin() != null) {
            _hashCode += getRgPostingTransactionJoin().hashCode();
        }
        if (getSalesOrderJoin() != null) {
            _hashCode += getSalesOrderJoin().hashCode();
        }
        if (getSalesRepJoin() != null) {
            _hashCode += getSalesRepJoin().hashCode();
        }
        if (getShippingAddressJoin() != null) {
            _hashCode += getShippingAddressJoin().hashCode();
        }
        if (getSubsidiaryJoin() != null) {
            _hashCode += getSubsidiaryJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getTaxCodeJoin() != null) {
            _hashCode += getTaxCodeJoin().hashCode();
        }
        if (getTaxDetailJoin() != null) {
            _hashCode += getTaxDetailJoin().hashCode();
        }
        if (getTaxItemJoin() != null) {
            _hashCode += getTaxItemJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
        }
        if (getToLocationJoin() != null) {
            _hashCode += getToLocationJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        if (getVendorLineJoin() != null) {
            _hashCode += getVendorLineJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "TransactionSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "accountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingPeriodJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "accountingPeriodJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "accountingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingTransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceToApplyAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "advanceToApplyAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "appliedToTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "applyingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddressJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingAddressJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "bomJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomRevisionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "bomRevisionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BomRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ClassificationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogsPurchaseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "cogsPurchaseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogsSaleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "cogsSaleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFromJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createdFromJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerMainJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customerMainJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "DepartmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "depositTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategoryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expenseCategoryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ExpenseCategorySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromLocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fromLocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fulfillingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerBillingAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "headerBillingAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetailJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "inventoryDetailJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetailSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNumberJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemNumberJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryNumberSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobMainJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "jobMainJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineBillingAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "lineBillingAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineFileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "lineFileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingOperationTaskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "manufacturingOperationTaskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApproverJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "nextApproverJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paidTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "payingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "payrollItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PayrollItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "purchaseOrderJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "requestorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revCommittingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revisionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecScheduleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecScheduleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RevRecScheduleSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rgPostingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "rgPostingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrderJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesOrderJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddressJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingAddressJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCodeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxCodeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SalesTaxItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxDetailJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SalesTaxItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toLocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "toLocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorLineJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vendorLineJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
