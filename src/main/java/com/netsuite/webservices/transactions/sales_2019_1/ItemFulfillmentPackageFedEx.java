/**
 * ItemFulfillmentPackageFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class ItemFulfillmentPackageFedEx  implements java.io.Serializable {
    private java.lang.Double packageWeightFedEx;

    private java.lang.Double dryIceWeightFedEx;

    private java.lang.String packageTrackingNumberFedEx;

    private com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx;

    private com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx;

    private java.lang.Boolean isNonStandardContainerFedEx;

    private java.lang.Boolean isAlcoholFedEx;

    private com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType alcoholRecipientTypeFedEx;

    private java.lang.Boolean isNonHazLithiumFedEx;

    private java.lang.Double insuredValueFedEx;

    private java.lang.Boolean useInsuredValueFedEx;

    private java.lang.String reference1FedEx;

    private com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx;

    private java.lang.String priorityAlertContentFedEx;

    private java.lang.Long packageLengthFedEx;

    private java.lang.Long packageWidthFedEx;

    private java.lang.Long packageHeightFedEx;

    private java.lang.Boolean useCodFedEx;

    private java.lang.Double codAmountFedEx;

    private com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx;

    private com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx;

    private com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx;

    private com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx;

    private java.lang.String signatureReleaseFedEx;

    private java.lang.String authorizationNumberFedEx;

    public ItemFulfillmentPackageFedEx() {
    }

    public ItemFulfillmentPackageFedEx(
           java.lang.Double packageWeightFedEx,
           java.lang.Double dryIceWeightFedEx,
           java.lang.String packageTrackingNumberFedEx,
           com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx,
           com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx,
           java.lang.Boolean isNonStandardContainerFedEx,
           java.lang.Boolean isAlcoholFedEx,
           com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType alcoholRecipientTypeFedEx,
           java.lang.Boolean isNonHazLithiumFedEx,
           java.lang.Double insuredValueFedEx,
           java.lang.Boolean useInsuredValueFedEx,
           java.lang.String reference1FedEx,
           com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx,
           java.lang.String priorityAlertContentFedEx,
           java.lang.Long packageLengthFedEx,
           java.lang.Long packageWidthFedEx,
           java.lang.Long packageHeightFedEx,
           java.lang.Boolean useCodFedEx,
           java.lang.Double codAmountFedEx,
           com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx,
           com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx,
           com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx,
           com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx,
           java.lang.String signatureReleaseFedEx,
           java.lang.String authorizationNumberFedEx) {
           this.packageWeightFedEx = packageWeightFedEx;
           this.dryIceWeightFedEx = dryIceWeightFedEx;
           this.packageTrackingNumberFedEx = packageTrackingNumberFedEx;
           this.packagingFedEx = packagingFedEx;
           this.admPackageTypeFedEx = admPackageTypeFedEx;
           this.isNonStandardContainerFedEx = isNonStandardContainerFedEx;
           this.isAlcoholFedEx = isAlcoholFedEx;
           this.alcoholRecipientTypeFedEx = alcoholRecipientTypeFedEx;
           this.isNonHazLithiumFedEx = isNonHazLithiumFedEx;
           this.insuredValueFedEx = insuredValueFedEx;
           this.useInsuredValueFedEx = useInsuredValueFedEx;
           this.reference1FedEx = reference1FedEx;
           this.priorityAlertTypeFedEx = priorityAlertTypeFedEx;
           this.priorityAlertContentFedEx = priorityAlertContentFedEx;
           this.packageLengthFedEx = packageLengthFedEx;
           this.packageWidthFedEx = packageWidthFedEx;
           this.packageHeightFedEx = packageHeightFedEx;
           this.useCodFedEx = useCodFedEx;
           this.codAmountFedEx = codAmountFedEx;
           this.codMethodFedEx = codMethodFedEx;
           this.codFreightTypeFedEx = codFreightTypeFedEx;
           this.deliveryConfFedEx = deliveryConfFedEx;
           this.signatureOptionsFedEx = signatureOptionsFedEx;
           this.signatureReleaseFedEx = signatureReleaseFedEx;
           this.authorizationNumberFedEx = authorizationNumberFedEx;
    }


    /**
     * Gets the packageWeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageWeightFedEx
     */
    public java.lang.Double getPackageWeightFedEx() {
        return packageWeightFedEx;
    }


    /**
     * Sets the packageWeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageWeightFedEx
     */
    public void setPackageWeightFedEx(java.lang.Double packageWeightFedEx) {
        this.packageWeightFedEx = packageWeightFedEx;
    }


    /**
     * Gets the dryIceWeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return dryIceWeightFedEx
     */
    public java.lang.Double getDryIceWeightFedEx() {
        return dryIceWeightFedEx;
    }


    /**
     * Sets the dryIceWeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param dryIceWeightFedEx
     */
    public void setDryIceWeightFedEx(java.lang.Double dryIceWeightFedEx) {
        this.dryIceWeightFedEx = dryIceWeightFedEx;
    }


    /**
     * Gets the packageTrackingNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageTrackingNumberFedEx
     */
    public java.lang.String getPackageTrackingNumberFedEx() {
        return packageTrackingNumberFedEx;
    }


    /**
     * Sets the packageTrackingNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageTrackingNumberFedEx
     */
    public void setPackageTrackingNumberFedEx(java.lang.String packageTrackingNumberFedEx) {
        this.packageTrackingNumberFedEx = packageTrackingNumberFedEx;
    }


    /**
     * Gets the packagingFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packagingFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPackagingFedEx getPackagingFedEx() {
        return packagingFedEx;
    }


    /**
     * Sets the packagingFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packagingFedEx
     */
    public void setPackagingFedEx(com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx) {
        this.packagingFedEx = packagingFedEx;
    }


    /**
     * Gets the admPackageTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return admPackageTypeFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExAdmPackageTypeFedEx getAdmPackageTypeFedEx() {
        return admPackageTypeFedEx;
    }


    /**
     * Sets the admPackageTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param admPackageTypeFedEx
     */
    public void setAdmPackageTypeFedEx(com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx) {
        this.admPackageTypeFedEx = admPackageTypeFedEx;
    }


    /**
     * Gets the isNonStandardContainerFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return isNonStandardContainerFedEx
     */
    public java.lang.Boolean getIsNonStandardContainerFedEx() {
        return isNonStandardContainerFedEx;
    }


    /**
     * Sets the isNonStandardContainerFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param isNonStandardContainerFedEx
     */
    public void setIsNonStandardContainerFedEx(java.lang.Boolean isNonStandardContainerFedEx) {
        this.isNonStandardContainerFedEx = isNonStandardContainerFedEx;
    }


    /**
     * Gets the isAlcoholFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return isAlcoholFedEx
     */
    public java.lang.Boolean getIsAlcoholFedEx() {
        return isAlcoholFedEx;
    }


    /**
     * Sets the isAlcoholFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param isAlcoholFedEx
     */
    public void setIsAlcoholFedEx(java.lang.Boolean isAlcoholFedEx) {
        this.isAlcoholFedEx = isAlcoholFedEx;
    }


    /**
     * Gets the alcoholRecipientTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return alcoholRecipientTypeFedEx
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType getAlcoholRecipientTypeFedEx() {
        return alcoholRecipientTypeFedEx;
    }


    /**
     * Sets the alcoholRecipientTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param alcoholRecipientTypeFedEx
     */
    public void setAlcoholRecipientTypeFedEx(com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType alcoholRecipientTypeFedEx) {
        this.alcoholRecipientTypeFedEx = alcoholRecipientTypeFedEx;
    }


    /**
     * Gets the isNonHazLithiumFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return isNonHazLithiumFedEx
     */
    public java.lang.Boolean getIsNonHazLithiumFedEx() {
        return isNonHazLithiumFedEx;
    }


    /**
     * Sets the isNonHazLithiumFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param isNonHazLithiumFedEx
     */
    public void setIsNonHazLithiumFedEx(java.lang.Boolean isNonHazLithiumFedEx) {
        this.isNonHazLithiumFedEx = isNonHazLithiumFedEx;
    }


    /**
     * Gets the insuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return insuredValueFedEx
     */
    public java.lang.Double getInsuredValueFedEx() {
        return insuredValueFedEx;
    }


    /**
     * Sets the insuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param insuredValueFedEx
     */
    public void setInsuredValueFedEx(java.lang.Double insuredValueFedEx) {
        this.insuredValueFedEx = insuredValueFedEx;
    }


    /**
     * Gets the useInsuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return useInsuredValueFedEx
     */
    public java.lang.Boolean getUseInsuredValueFedEx() {
        return useInsuredValueFedEx;
    }


    /**
     * Sets the useInsuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param useInsuredValueFedEx
     */
    public void setUseInsuredValueFedEx(java.lang.Boolean useInsuredValueFedEx) {
        this.useInsuredValueFedEx = useInsuredValueFedEx;
    }


    /**
     * Gets the reference1FedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return reference1FedEx
     */
    public java.lang.String getReference1FedEx() {
        return reference1FedEx;
    }


    /**
     * Sets the reference1FedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param reference1FedEx
     */
    public void setReference1FedEx(java.lang.String reference1FedEx) {
        this.reference1FedEx = reference1FedEx;
    }


    /**
     * Gets the priorityAlertTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return priorityAlertTypeFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPriorityAlertTypeFedEx getPriorityAlertTypeFedEx() {
        return priorityAlertTypeFedEx;
    }


    /**
     * Sets the priorityAlertTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param priorityAlertTypeFedEx
     */
    public void setPriorityAlertTypeFedEx(com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx) {
        this.priorityAlertTypeFedEx = priorityAlertTypeFedEx;
    }


    /**
     * Gets the priorityAlertContentFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return priorityAlertContentFedEx
     */
    public java.lang.String getPriorityAlertContentFedEx() {
        return priorityAlertContentFedEx;
    }


    /**
     * Sets the priorityAlertContentFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param priorityAlertContentFedEx
     */
    public void setPriorityAlertContentFedEx(java.lang.String priorityAlertContentFedEx) {
        this.priorityAlertContentFedEx = priorityAlertContentFedEx;
    }


    /**
     * Gets the packageLengthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageLengthFedEx
     */
    public java.lang.Long getPackageLengthFedEx() {
        return packageLengthFedEx;
    }


    /**
     * Sets the packageLengthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageLengthFedEx
     */
    public void setPackageLengthFedEx(java.lang.Long packageLengthFedEx) {
        this.packageLengthFedEx = packageLengthFedEx;
    }


    /**
     * Gets the packageWidthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageWidthFedEx
     */
    public java.lang.Long getPackageWidthFedEx() {
        return packageWidthFedEx;
    }


    /**
     * Sets the packageWidthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageWidthFedEx
     */
    public void setPackageWidthFedEx(java.lang.Long packageWidthFedEx) {
        this.packageWidthFedEx = packageWidthFedEx;
    }


    /**
     * Gets the packageHeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageHeightFedEx
     */
    public java.lang.Long getPackageHeightFedEx() {
        return packageHeightFedEx;
    }


    /**
     * Sets the packageHeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageHeightFedEx
     */
    public void setPackageHeightFedEx(java.lang.Long packageHeightFedEx) {
        this.packageHeightFedEx = packageHeightFedEx;
    }


    /**
     * Gets the useCodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return useCodFedEx
     */
    public java.lang.Boolean getUseCodFedEx() {
        return useCodFedEx;
    }


    /**
     * Sets the useCodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param useCodFedEx
     */
    public void setUseCodFedEx(java.lang.Boolean useCodFedEx) {
        this.useCodFedEx = useCodFedEx;
    }


    /**
     * Gets the codAmountFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return codAmountFedEx
     */
    public java.lang.Double getCodAmountFedEx() {
        return codAmountFedEx;
    }


    /**
     * Sets the codAmountFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param codAmountFedEx
     */
    public void setCodAmountFedEx(java.lang.Double codAmountFedEx) {
        this.codAmountFedEx = codAmountFedEx;
    }


    /**
     * Gets the codMethodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return codMethodFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodMethodFedEx getCodMethodFedEx() {
        return codMethodFedEx;
    }


    /**
     * Sets the codMethodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param codMethodFedEx
     */
    public void setCodMethodFedEx(com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx) {
        this.codMethodFedEx = codMethodFedEx;
    }


    /**
     * Gets the codFreightTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return codFreightTypeFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodFreightTypeFedEx getCodFreightTypeFedEx() {
        return codFreightTypeFedEx;
    }


    /**
     * Sets the codFreightTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param codFreightTypeFedEx
     */
    public void setCodFreightTypeFedEx(com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx) {
        this.codFreightTypeFedEx = codFreightTypeFedEx;
    }


    /**
     * Gets the deliveryConfFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return deliveryConfFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExDeliveryConfFedEx getDeliveryConfFedEx() {
        return deliveryConfFedEx;
    }


    /**
     * Sets the deliveryConfFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param deliveryConfFedEx
     */
    public void setDeliveryConfFedEx(com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx) {
        this.deliveryConfFedEx = deliveryConfFedEx;
    }


    /**
     * Gets the signatureOptionsFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return signatureOptionsFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExSignatureOptionsFedEx getSignatureOptionsFedEx() {
        return signatureOptionsFedEx;
    }


    /**
     * Sets the signatureOptionsFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param signatureOptionsFedEx
     */
    public void setSignatureOptionsFedEx(com.netsuite.webservices.transactions.sales_2019_1.types.ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx) {
        this.signatureOptionsFedEx = signatureOptionsFedEx;
    }


    /**
     * Gets the signatureReleaseFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return signatureReleaseFedEx
     */
    public java.lang.String getSignatureReleaseFedEx() {
        return signatureReleaseFedEx;
    }


    /**
     * Sets the signatureReleaseFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param signatureReleaseFedEx
     */
    public void setSignatureReleaseFedEx(java.lang.String signatureReleaseFedEx) {
        this.signatureReleaseFedEx = signatureReleaseFedEx;
    }


    /**
     * Gets the authorizationNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return authorizationNumberFedEx
     */
    public java.lang.String getAuthorizationNumberFedEx() {
        return authorizationNumberFedEx;
    }


    /**
     * Sets the authorizationNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param authorizationNumberFedEx
     */
    public void setAuthorizationNumberFedEx(java.lang.String authorizationNumberFedEx) {
        this.authorizationNumberFedEx = authorizationNumberFedEx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageFedEx)) return false;
        ItemFulfillmentPackageFedEx other = (ItemFulfillmentPackageFedEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageWeightFedEx==null && other.getPackageWeightFedEx()==null) || 
             (this.packageWeightFedEx!=null &&
              this.packageWeightFedEx.equals(other.getPackageWeightFedEx()))) &&
            ((this.dryIceWeightFedEx==null && other.getDryIceWeightFedEx()==null) || 
             (this.dryIceWeightFedEx!=null &&
              this.dryIceWeightFedEx.equals(other.getDryIceWeightFedEx()))) &&
            ((this.packageTrackingNumberFedEx==null && other.getPackageTrackingNumberFedEx()==null) || 
             (this.packageTrackingNumberFedEx!=null &&
              this.packageTrackingNumberFedEx.equals(other.getPackageTrackingNumberFedEx()))) &&
            ((this.packagingFedEx==null && other.getPackagingFedEx()==null) || 
             (this.packagingFedEx!=null &&
              this.packagingFedEx.equals(other.getPackagingFedEx()))) &&
            ((this.admPackageTypeFedEx==null && other.getAdmPackageTypeFedEx()==null) || 
             (this.admPackageTypeFedEx!=null &&
              this.admPackageTypeFedEx.equals(other.getAdmPackageTypeFedEx()))) &&
            ((this.isNonStandardContainerFedEx==null && other.getIsNonStandardContainerFedEx()==null) || 
             (this.isNonStandardContainerFedEx!=null &&
              this.isNonStandardContainerFedEx.equals(other.getIsNonStandardContainerFedEx()))) &&
            ((this.isAlcoholFedEx==null && other.getIsAlcoholFedEx()==null) || 
             (this.isAlcoholFedEx!=null &&
              this.isAlcoholFedEx.equals(other.getIsAlcoholFedEx()))) &&
            ((this.alcoholRecipientTypeFedEx==null && other.getAlcoholRecipientTypeFedEx()==null) || 
             (this.alcoholRecipientTypeFedEx!=null &&
              this.alcoholRecipientTypeFedEx.equals(other.getAlcoholRecipientTypeFedEx()))) &&
            ((this.isNonHazLithiumFedEx==null && other.getIsNonHazLithiumFedEx()==null) || 
             (this.isNonHazLithiumFedEx!=null &&
              this.isNonHazLithiumFedEx.equals(other.getIsNonHazLithiumFedEx()))) &&
            ((this.insuredValueFedEx==null && other.getInsuredValueFedEx()==null) || 
             (this.insuredValueFedEx!=null &&
              this.insuredValueFedEx.equals(other.getInsuredValueFedEx()))) &&
            ((this.useInsuredValueFedEx==null && other.getUseInsuredValueFedEx()==null) || 
             (this.useInsuredValueFedEx!=null &&
              this.useInsuredValueFedEx.equals(other.getUseInsuredValueFedEx()))) &&
            ((this.reference1FedEx==null && other.getReference1FedEx()==null) || 
             (this.reference1FedEx!=null &&
              this.reference1FedEx.equals(other.getReference1FedEx()))) &&
            ((this.priorityAlertTypeFedEx==null && other.getPriorityAlertTypeFedEx()==null) || 
             (this.priorityAlertTypeFedEx!=null &&
              this.priorityAlertTypeFedEx.equals(other.getPriorityAlertTypeFedEx()))) &&
            ((this.priorityAlertContentFedEx==null && other.getPriorityAlertContentFedEx()==null) || 
             (this.priorityAlertContentFedEx!=null &&
              this.priorityAlertContentFedEx.equals(other.getPriorityAlertContentFedEx()))) &&
            ((this.packageLengthFedEx==null && other.getPackageLengthFedEx()==null) || 
             (this.packageLengthFedEx!=null &&
              this.packageLengthFedEx.equals(other.getPackageLengthFedEx()))) &&
            ((this.packageWidthFedEx==null && other.getPackageWidthFedEx()==null) || 
             (this.packageWidthFedEx!=null &&
              this.packageWidthFedEx.equals(other.getPackageWidthFedEx()))) &&
            ((this.packageHeightFedEx==null && other.getPackageHeightFedEx()==null) || 
             (this.packageHeightFedEx!=null &&
              this.packageHeightFedEx.equals(other.getPackageHeightFedEx()))) &&
            ((this.useCodFedEx==null && other.getUseCodFedEx()==null) || 
             (this.useCodFedEx!=null &&
              this.useCodFedEx.equals(other.getUseCodFedEx()))) &&
            ((this.codAmountFedEx==null && other.getCodAmountFedEx()==null) || 
             (this.codAmountFedEx!=null &&
              this.codAmountFedEx.equals(other.getCodAmountFedEx()))) &&
            ((this.codMethodFedEx==null && other.getCodMethodFedEx()==null) || 
             (this.codMethodFedEx!=null &&
              this.codMethodFedEx.equals(other.getCodMethodFedEx()))) &&
            ((this.codFreightTypeFedEx==null && other.getCodFreightTypeFedEx()==null) || 
             (this.codFreightTypeFedEx!=null &&
              this.codFreightTypeFedEx.equals(other.getCodFreightTypeFedEx()))) &&
            ((this.deliveryConfFedEx==null && other.getDeliveryConfFedEx()==null) || 
             (this.deliveryConfFedEx!=null &&
              this.deliveryConfFedEx.equals(other.getDeliveryConfFedEx()))) &&
            ((this.signatureOptionsFedEx==null && other.getSignatureOptionsFedEx()==null) || 
             (this.signatureOptionsFedEx!=null &&
              this.signatureOptionsFedEx.equals(other.getSignatureOptionsFedEx()))) &&
            ((this.signatureReleaseFedEx==null && other.getSignatureReleaseFedEx()==null) || 
             (this.signatureReleaseFedEx!=null &&
              this.signatureReleaseFedEx.equals(other.getSignatureReleaseFedEx()))) &&
            ((this.authorizationNumberFedEx==null && other.getAuthorizationNumberFedEx()==null) || 
             (this.authorizationNumberFedEx!=null &&
              this.authorizationNumberFedEx.equals(other.getAuthorizationNumberFedEx())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPackageWeightFedEx() != null) {
            _hashCode += getPackageWeightFedEx().hashCode();
        }
        if (getDryIceWeightFedEx() != null) {
            _hashCode += getDryIceWeightFedEx().hashCode();
        }
        if (getPackageTrackingNumberFedEx() != null) {
            _hashCode += getPackageTrackingNumberFedEx().hashCode();
        }
        if (getPackagingFedEx() != null) {
            _hashCode += getPackagingFedEx().hashCode();
        }
        if (getAdmPackageTypeFedEx() != null) {
            _hashCode += getAdmPackageTypeFedEx().hashCode();
        }
        if (getIsNonStandardContainerFedEx() != null) {
            _hashCode += getIsNonStandardContainerFedEx().hashCode();
        }
        if (getIsAlcoholFedEx() != null) {
            _hashCode += getIsAlcoholFedEx().hashCode();
        }
        if (getAlcoholRecipientTypeFedEx() != null) {
            _hashCode += getAlcoholRecipientTypeFedEx().hashCode();
        }
        if (getIsNonHazLithiumFedEx() != null) {
            _hashCode += getIsNonHazLithiumFedEx().hashCode();
        }
        if (getInsuredValueFedEx() != null) {
            _hashCode += getInsuredValueFedEx().hashCode();
        }
        if (getUseInsuredValueFedEx() != null) {
            _hashCode += getUseInsuredValueFedEx().hashCode();
        }
        if (getReference1FedEx() != null) {
            _hashCode += getReference1FedEx().hashCode();
        }
        if (getPriorityAlertTypeFedEx() != null) {
            _hashCode += getPriorityAlertTypeFedEx().hashCode();
        }
        if (getPriorityAlertContentFedEx() != null) {
            _hashCode += getPriorityAlertContentFedEx().hashCode();
        }
        if (getPackageLengthFedEx() != null) {
            _hashCode += getPackageLengthFedEx().hashCode();
        }
        if (getPackageWidthFedEx() != null) {
            _hashCode += getPackageWidthFedEx().hashCode();
        }
        if (getPackageHeightFedEx() != null) {
            _hashCode += getPackageHeightFedEx().hashCode();
        }
        if (getUseCodFedEx() != null) {
            _hashCode += getUseCodFedEx().hashCode();
        }
        if (getCodAmountFedEx() != null) {
            _hashCode += getCodAmountFedEx().hashCode();
        }
        if (getCodMethodFedEx() != null) {
            _hashCode += getCodMethodFedEx().hashCode();
        }
        if (getCodFreightTypeFedEx() != null) {
            _hashCode += getCodFreightTypeFedEx().hashCode();
        }
        if (getDeliveryConfFedEx() != null) {
            _hashCode += getDeliveryConfFedEx().hashCode();
        }
        if (getSignatureOptionsFedEx() != null) {
            _hashCode += getSignatureOptionsFedEx().hashCode();
        }
        if (getSignatureReleaseFedEx() != null) {
            _hashCode += getSignatureReleaseFedEx().hashCode();
        }
        if (getAuthorizationNumberFedEx() != null) {
            _hashCode += getAuthorizationNumberFedEx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageFedEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeightFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packageWeightFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dryIceWeightFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "dryIceWeightFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageTrackingNumberFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packageTrackingNumberFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packagingFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPackagingFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admPackageTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "admPackageTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExAdmPackageTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNonStandardContainerFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isNonStandardContainerFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAlcoholFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isAlcoholFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcoholRecipientTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "alcoholRecipientTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AlcoholRecipientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNonHazLithiumFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isNonHazLithiumFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredValueFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "insuredValueFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useInsuredValueFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "useInsuredValueFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference1FedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "reference1FedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityAlertTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "priorityAlertTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPriorityAlertTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityAlertContentFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "priorityAlertContentFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageLengthFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packageLengthFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWidthFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packageWidthFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageHeightFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packageHeightFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCodFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "useCodFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAmountFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "codAmountFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMethodFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "codMethodFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodMethodFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFreightTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "codFreightTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodFreightTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryConfFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "deliveryConfFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExDeliveryConfFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOptionsFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "signatureOptionsFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExSignatureOptionsFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureReleaseFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "signatureReleaseFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNumberFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "authorizationNumberFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
