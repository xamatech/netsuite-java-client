/**
 * ItemSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ItemSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.RevRecTemplateSearchRowBasic accountingBookRevRecScheduleJoin;

    private com.netsuite.webservices.platform.common_2019_1.AssemblyItemBomSearchRowBasic assemblyItemBillOfMaterialsJoin;

    private com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic binNumberJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemBinNumberSearchRowBasic binOnHandJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic correlatedItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic effectiveRevisionJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic inventoryDetailJoin;

    private com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic inventoryLocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic inventoryNumberJoin;

    private com.netsuite.webservices.platform.common_2019_1.InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic memberItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic obsoleteRevisionJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic parentJoin;

    private com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic preferredLocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic preferredVendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic pricingJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic shopperJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public ItemSearchRow() {
    }

    public ItemSearchRow(
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.RevRecTemplateSearchRowBasic accountingBookRevRecScheduleJoin,
           com.netsuite.webservices.platform.common_2019_1.AssemblyItemBomSearchRowBasic assemblyItemBillOfMaterialsJoin,
           com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic binNumberJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemBinNumberSearchRowBasic binOnHandJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic correlatedItemJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic effectiveRevisionJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic inventoryDetailJoin,
           com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic inventoryLocationJoin,
           com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic inventoryNumberJoin,
           com.netsuite.webservices.platform.common_2019_1.InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic memberItemJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic obsoleteRevisionJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic parentJoin,
           com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic preferredLocationJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic preferredVendorJoin,
           com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic pricingJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic shopperJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.accountingBookRevRecScheduleJoin = accountingBookRevRecScheduleJoin;
        this.assemblyItemBillOfMaterialsJoin = assemblyItemBillOfMaterialsJoin;
        this.binNumberJoin = binNumberJoin;
        this.binOnHandJoin = binOnHandJoin;
        this.correlatedItemJoin = correlatedItemJoin;
        this.effectiveRevisionJoin = effectiveRevisionJoin;
        this.fileJoin = fileJoin;
        this.inventoryDetailJoin = inventoryDetailJoin;
        this.inventoryLocationJoin = inventoryLocationJoin;
        this.inventoryNumberJoin = inventoryNumberJoin;
        this.inventoryNumberBinOnHandJoin = inventoryNumberBinOnHandJoin;
        this.memberItemJoin = memberItemJoin;
        this.obsoleteRevisionJoin = obsoleteRevisionJoin;
        this.parentJoin = parentJoin;
        this.preferredLocationJoin = preferredLocationJoin;
        this.preferredVendorJoin = preferredVendorJoin;
        this.pricingJoin = pricingJoin;
        this.shopperJoin = shopperJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this ItemSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ItemSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the accountingBookRevRecScheduleJoin value for this ItemSearchRow.
     * 
     * @return accountingBookRevRecScheduleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.RevRecTemplateSearchRowBasic getAccountingBookRevRecScheduleJoin() {
        return accountingBookRevRecScheduleJoin;
    }


    /**
     * Sets the accountingBookRevRecScheduleJoin value for this ItemSearchRow.
     * 
     * @param accountingBookRevRecScheduleJoin
     */
    public void setAccountingBookRevRecScheduleJoin(com.netsuite.webservices.platform.common_2019_1.RevRecTemplateSearchRowBasic accountingBookRevRecScheduleJoin) {
        this.accountingBookRevRecScheduleJoin = accountingBookRevRecScheduleJoin;
    }


    /**
     * Gets the assemblyItemBillOfMaterialsJoin value for this ItemSearchRow.
     * 
     * @return assemblyItemBillOfMaterialsJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AssemblyItemBomSearchRowBasic getAssemblyItemBillOfMaterialsJoin() {
        return assemblyItemBillOfMaterialsJoin;
    }


    /**
     * Sets the assemblyItemBillOfMaterialsJoin value for this ItemSearchRow.
     * 
     * @param assemblyItemBillOfMaterialsJoin
     */
    public void setAssemblyItemBillOfMaterialsJoin(com.netsuite.webservices.platform.common_2019_1.AssemblyItemBomSearchRowBasic assemblyItemBillOfMaterialsJoin) {
        this.assemblyItemBillOfMaterialsJoin = assemblyItemBillOfMaterialsJoin;
    }


    /**
     * Gets the binNumberJoin value for this ItemSearchRow.
     * 
     * @return binNumberJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }


    /**
     * Sets the binNumberJoin value for this ItemSearchRow.
     * 
     * @param binNumberJoin
     */
    public void setBinNumberJoin(com.netsuite.webservices.platform.common_2019_1.BinSearchRowBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }


    /**
     * Gets the binOnHandJoin value for this ItemSearchRow.
     * 
     * @return binOnHandJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemBinNumberSearchRowBasic getBinOnHandJoin() {
        return binOnHandJoin;
    }


    /**
     * Sets the binOnHandJoin value for this ItemSearchRow.
     * 
     * @param binOnHandJoin
     */
    public void setBinOnHandJoin(com.netsuite.webservices.platform.common_2019_1.ItemBinNumberSearchRowBasic binOnHandJoin) {
        this.binOnHandJoin = binOnHandJoin;
    }


    /**
     * Gets the correlatedItemJoin value for this ItemSearchRow.
     * 
     * @return correlatedItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getCorrelatedItemJoin() {
        return correlatedItemJoin;
    }


    /**
     * Sets the correlatedItemJoin value for this ItemSearchRow.
     * 
     * @param correlatedItemJoin
     */
    public void setCorrelatedItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic correlatedItemJoin) {
        this.correlatedItemJoin = correlatedItemJoin;
    }


    /**
     * Gets the effectiveRevisionJoin value for this ItemSearchRow.
     * 
     * @return effectiveRevisionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic getEffectiveRevisionJoin() {
        return effectiveRevisionJoin;
    }


    /**
     * Sets the effectiveRevisionJoin value for this ItemSearchRow.
     * 
     * @param effectiveRevisionJoin
     */
    public void setEffectiveRevisionJoin(com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic effectiveRevisionJoin) {
        this.effectiveRevisionJoin = effectiveRevisionJoin;
    }


    /**
     * Gets the fileJoin value for this ItemSearchRow.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this ItemSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the inventoryDetailJoin value for this ItemSearchRow.
     * 
     * @return inventoryDetailJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }


    /**
     * Sets the inventoryDetailJoin value for this ItemSearchRow.
     * 
     * @param inventoryDetailJoin
     */
    public void setInventoryDetailJoin(com.netsuite.webservices.platform.common_2019_1.InventoryDetailSearchRowBasic inventoryDetailJoin) {
        this.inventoryDetailJoin = inventoryDetailJoin;
    }


    /**
     * Gets the inventoryLocationJoin value for this ItemSearchRow.
     * 
     * @return inventoryLocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }


    /**
     * Sets the inventoryLocationJoin value for this ItemSearchRow.
     * 
     * @param inventoryLocationJoin
     */
    public void setInventoryLocationJoin(com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic inventoryLocationJoin) {
        this.inventoryLocationJoin = inventoryLocationJoin;
    }


    /**
     * Gets the inventoryNumberJoin value for this ItemSearchRow.
     * 
     * @return inventoryNumberJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic getInventoryNumberJoin() {
        return inventoryNumberJoin;
    }


    /**
     * Sets the inventoryNumberJoin value for this ItemSearchRow.
     * 
     * @param inventoryNumberJoin
     */
    public void setInventoryNumberJoin(com.netsuite.webservices.platform.common_2019_1.InventoryNumberSearchRowBasic inventoryNumberJoin) {
        this.inventoryNumberJoin = inventoryNumberJoin;
    }


    /**
     * Gets the inventoryNumberBinOnHandJoin value for this ItemSearchRow.
     * 
     * @return inventoryNumberBinOnHandJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryNumberBinSearchRowBasic getInventoryNumberBinOnHandJoin() {
        return inventoryNumberBinOnHandJoin;
    }


    /**
     * Sets the inventoryNumberBinOnHandJoin value for this ItemSearchRow.
     * 
     * @param inventoryNumberBinOnHandJoin
     */
    public void setInventoryNumberBinOnHandJoin(com.netsuite.webservices.platform.common_2019_1.InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin) {
        this.inventoryNumberBinOnHandJoin = inventoryNumberBinOnHandJoin;
    }


    /**
     * Gets the memberItemJoin value for this ItemSearchRow.
     * 
     * @return memberItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getMemberItemJoin() {
        return memberItemJoin;
    }


    /**
     * Sets the memberItemJoin value for this ItemSearchRow.
     * 
     * @param memberItemJoin
     */
    public void setMemberItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic memberItemJoin) {
        this.memberItemJoin = memberItemJoin;
    }


    /**
     * Gets the obsoleteRevisionJoin value for this ItemSearchRow.
     * 
     * @return obsoleteRevisionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic getObsoleteRevisionJoin() {
        return obsoleteRevisionJoin;
    }


    /**
     * Sets the obsoleteRevisionJoin value for this ItemSearchRow.
     * 
     * @param obsoleteRevisionJoin
     */
    public void setObsoleteRevisionJoin(com.netsuite.webservices.platform.common_2019_1.ItemRevisionSearchRowBasic obsoleteRevisionJoin) {
        this.obsoleteRevisionJoin = obsoleteRevisionJoin;
    }


    /**
     * Gets the parentJoin value for this ItemSearchRow.
     * 
     * @return parentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getParentJoin() {
        return parentJoin;
    }


    /**
     * Sets the parentJoin value for this ItemSearchRow.
     * 
     * @param parentJoin
     */
    public void setParentJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic parentJoin) {
        this.parentJoin = parentJoin;
    }


    /**
     * Gets the preferredLocationJoin value for this ItemSearchRow.
     * 
     * @return preferredLocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }


    /**
     * Sets the preferredLocationJoin value for this ItemSearchRow.
     * 
     * @param preferredLocationJoin
     */
    public void setPreferredLocationJoin(com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic preferredLocationJoin) {
        this.preferredLocationJoin = preferredLocationJoin;
    }


    /**
     * Gets the preferredVendorJoin value for this ItemSearchRow.
     * 
     * @return preferredVendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }


    /**
     * Sets the preferredVendorJoin value for this ItemSearchRow.
     * 
     * @param preferredVendorJoin
     */
    public void setPreferredVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic preferredVendorJoin) {
        this.preferredVendorJoin = preferredVendorJoin;
    }


    /**
     * Gets the pricingJoin value for this ItemSearchRow.
     * 
     * @return pricingJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic getPricingJoin() {
        return pricingJoin;
    }


    /**
     * Sets the pricingJoin value for this ItemSearchRow.
     * 
     * @param pricingJoin
     */
    public void setPricingJoin(com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic pricingJoin) {
        this.pricingJoin = pricingJoin;
    }


    /**
     * Gets the shopperJoin value for this ItemSearchRow.
     * 
     * @return shopperJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getShopperJoin() {
        return shopperJoin;
    }


    /**
     * Sets the shopperJoin value for this ItemSearchRow.
     * 
     * @param shopperJoin
     */
    public void setShopperJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic shopperJoin) {
        this.shopperJoin = shopperJoin;
    }


    /**
     * Gets the transactionJoin value for this ItemSearchRow.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this ItemSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this ItemSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ItemSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this ItemSearchRow.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this ItemSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the vendorJoin value for this ItemSearchRow.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this ItemSearchRow.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the customSearchJoin value for this ItemSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ItemSearchRow.
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
        if (!(obj instanceof ItemSearchRow)) return false;
        ItemSearchRow other = (ItemSearchRow) obj;
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
            ((this.accountingBookRevRecScheduleJoin==null && other.getAccountingBookRevRecScheduleJoin()==null) || 
             (this.accountingBookRevRecScheduleJoin!=null &&
              this.accountingBookRevRecScheduleJoin.equals(other.getAccountingBookRevRecScheduleJoin()))) &&
            ((this.assemblyItemBillOfMaterialsJoin==null && other.getAssemblyItemBillOfMaterialsJoin()==null) || 
             (this.assemblyItemBillOfMaterialsJoin!=null &&
              this.assemblyItemBillOfMaterialsJoin.equals(other.getAssemblyItemBillOfMaterialsJoin()))) &&
            ((this.binNumberJoin==null && other.getBinNumberJoin()==null) || 
             (this.binNumberJoin!=null &&
              this.binNumberJoin.equals(other.getBinNumberJoin()))) &&
            ((this.binOnHandJoin==null && other.getBinOnHandJoin()==null) || 
             (this.binOnHandJoin!=null &&
              this.binOnHandJoin.equals(other.getBinOnHandJoin()))) &&
            ((this.correlatedItemJoin==null && other.getCorrelatedItemJoin()==null) || 
             (this.correlatedItemJoin!=null &&
              this.correlatedItemJoin.equals(other.getCorrelatedItemJoin()))) &&
            ((this.effectiveRevisionJoin==null && other.getEffectiveRevisionJoin()==null) || 
             (this.effectiveRevisionJoin!=null &&
              this.effectiveRevisionJoin.equals(other.getEffectiveRevisionJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.inventoryDetailJoin==null && other.getInventoryDetailJoin()==null) || 
             (this.inventoryDetailJoin!=null &&
              this.inventoryDetailJoin.equals(other.getInventoryDetailJoin()))) &&
            ((this.inventoryLocationJoin==null && other.getInventoryLocationJoin()==null) || 
             (this.inventoryLocationJoin!=null &&
              this.inventoryLocationJoin.equals(other.getInventoryLocationJoin()))) &&
            ((this.inventoryNumberJoin==null && other.getInventoryNumberJoin()==null) || 
             (this.inventoryNumberJoin!=null &&
              this.inventoryNumberJoin.equals(other.getInventoryNumberJoin()))) &&
            ((this.inventoryNumberBinOnHandJoin==null && other.getInventoryNumberBinOnHandJoin()==null) || 
             (this.inventoryNumberBinOnHandJoin!=null &&
              this.inventoryNumberBinOnHandJoin.equals(other.getInventoryNumberBinOnHandJoin()))) &&
            ((this.memberItemJoin==null && other.getMemberItemJoin()==null) || 
             (this.memberItemJoin!=null &&
              this.memberItemJoin.equals(other.getMemberItemJoin()))) &&
            ((this.obsoleteRevisionJoin==null && other.getObsoleteRevisionJoin()==null) || 
             (this.obsoleteRevisionJoin!=null &&
              this.obsoleteRevisionJoin.equals(other.getObsoleteRevisionJoin()))) &&
            ((this.parentJoin==null && other.getParentJoin()==null) || 
             (this.parentJoin!=null &&
              this.parentJoin.equals(other.getParentJoin()))) &&
            ((this.preferredLocationJoin==null && other.getPreferredLocationJoin()==null) || 
             (this.preferredLocationJoin!=null &&
              this.preferredLocationJoin.equals(other.getPreferredLocationJoin()))) &&
            ((this.preferredVendorJoin==null && other.getPreferredVendorJoin()==null) || 
             (this.preferredVendorJoin!=null &&
              this.preferredVendorJoin.equals(other.getPreferredVendorJoin()))) &&
            ((this.pricingJoin==null && other.getPricingJoin()==null) || 
             (this.pricingJoin!=null &&
              this.pricingJoin.equals(other.getPricingJoin()))) &&
            ((this.shopperJoin==null && other.getShopperJoin()==null) || 
             (this.shopperJoin!=null &&
              this.shopperJoin.equals(other.getShopperJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin()))) &&
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
        if (getAccountingBookRevRecScheduleJoin() != null) {
            _hashCode += getAccountingBookRevRecScheduleJoin().hashCode();
        }
        if (getAssemblyItemBillOfMaterialsJoin() != null) {
            _hashCode += getAssemblyItemBillOfMaterialsJoin().hashCode();
        }
        if (getBinNumberJoin() != null) {
            _hashCode += getBinNumberJoin().hashCode();
        }
        if (getBinOnHandJoin() != null) {
            _hashCode += getBinOnHandJoin().hashCode();
        }
        if (getCorrelatedItemJoin() != null) {
            _hashCode += getCorrelatedItemJoin().hashCode();
        }
        if (getEffectiveRevisionJoin() != null) {
            _hashCode += getEffectiveRevisionJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getInventoryDetailJoin() != null) {
            _hashCode += getInventoryDetailJoin().hashCode();
        }
        if (getInventoryLocationJoin() != null) {
            _hashCode += getInventoryLocationJoin().hashCode();
        }
        if (getInventoryNumberJoin() != null) {
            _hashCode += getInventoryNumberJoin().hashCode();
        }
        if (getInventoryNumberBinOnHandJoin() != null) {
            _hashCode += getInventoryNumberBinOnHandJoin().hashCode();
        }
        if (getMemberItemJoin() != null) {
            _hashCode += getMemberItemJoin().hashCode();
        }
        if (getObsoleteRevisionJoin() != null) {
            _hashCode += getObsoleteRevisionJoin().hashCode();
        }
        if (getParentJoin() != null) {
            _hashCode += getParentJoin().hashCode();
        }
        if (getPreferredLocationJoin() != null) {
            _hashCode += getPreferredLocationJoin().hashCode();
        }
        if (getPreferredVendorJoin() != null) {
            _hashCode += getPreferredVendorJoin().hashCode();
        }
        if (getPricingJoin() != null) {
            _hashCode += getPricingJoin().hashCode();
        }
        if (getShopperJoin() != null) {
            _hashCode += getShopperJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(ItemSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ItemSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookRevRecScheduleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountingBookRevRecScheduleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RevRecTemplateSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assemblyItemBillOfMaterialsJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "assemblyItemBillOfMaterialsJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "binOnHandJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemBinNumberSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "correlatedItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRevisionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "effectiveRevisionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetailJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inventoryDetailJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetailSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryLocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inventoryLocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryNumberJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inventoryNumberJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryNumberSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryNumberBinOnHandJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inventoryNumberBinOnHandJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryNumberBinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "memberItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsoleteRevisionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "obsoleteRevisionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "parentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "preferredLocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredVendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "preferredVendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "pricingJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PricingSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shopperJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customSearchJoin"));
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
