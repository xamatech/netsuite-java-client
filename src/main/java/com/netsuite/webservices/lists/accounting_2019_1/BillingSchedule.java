/**
 * BillingSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class BillingSchedule  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleType scheduleType;

    private java.lang.String name;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrencePattern recurrencePattern;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef project;

    private java.lang.String initialAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef initialTerms;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleFrequency frequency;

    private com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList recurrenceDowMaskList;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode yearMode;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowim yearDowim;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDow yearDow;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowimMonth yearDowimMonth;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearMonth yearMonth;

    private java.lang.Long yearDom;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode monthMode;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDowim monthDowim;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDow monthDow;

    private java.lang.Long monthDom;

    private java.lang.Long dayPeriod;

    private com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRepeatEvery repeatEvery;

    private java.lang.Boolean billForActuals;

    private java.lang.Long numberRemaining;

    private java.lang.Boolean inArrears;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef recurrenceTerms;

    private java.lang.Boolean isPublic;

    private java.lang.Boolean applyToSubtotal;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transaction;

    private java.lang.Boolean isInactive;

    private java.util.Calendar seriesStartDate;

    private com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleRecurrenceList recurrenceList;

    private com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleMilestoneList milestoneList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public BillingSchedule() {
    }

    public BillingSchedule(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleType scheduleType,
           java.lang.String name,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrencePattern recurrencePattern,
           com.netsuite.webservices.platform.core_2019_1.RecordRef project,
           java.lang.String initialAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef initialTerms,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleFrequency frequency,
           com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList recurrenceDowMaskList,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode yearMode,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowim yearDowim,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDow yearDow,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowimMonth yearDowimMonth,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearMonth yearMonth,
           java.lang.Long yearDom,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode monthMode,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDowim monthDowim,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDow monthDow,
           java.lang.Long monthDom,
           java.lang.Long dayPeriod,
           com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRepeatEvery repeatEvery,
           java.lang.Boolean billForActuals,
           java.lang.Long numberRemaining,
           java.lang.Boolean inArrears,
           com.netsuite.webservices.platform.core_2019_1.RecordRef recurrenceTerms,
           java.lang.Boolean isPublic,
           java.lang.Boolean applyToSubtotal,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transaction,
           java.lang.Boolean isInactive,
           java.util.Calendar seriesStartDate,
           com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleRecurrenceList recurrenceList,
           com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleMilestoneList milestoneList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.scheduleType = scheduleType;
        this.name = name;
        this.recurrencePattern = recurrencePattern;
        this.project = project;
        this.initialAmount = initialAmount;
        this.initialTerms = initialTerms;
        this.frequency = frequency;
        this.recurrenceDowMaskList = recurrenceDowMaskList;
        this.yearMode = yearMode;
        this.yearDowim = yearDowim;
        this.yearDow = yearDow;
        this.yearDowimMonth = yearDowimMonth;
        this.yearMonth = yearMonth;
        this.yearDom = yearDom;
        this.monthMode = monthMode;
        this.monthDowim = monthDowim;
        this.monthDow = monthDow;
        this.monthDom = monthDom;
        this.dayPeriod = dayPeriod;
        this.repeatEvery = repeatEvery;
        this.billForActuals = billForActuals;
        this.numberRemaining = numberRemaining;
        this.inArrears = inArrears;
        this.recurrenceTerms = recurrenceTerms;
        this.isPublic = isPublic;
        this.applyToSubtotal = applyToSubtotal;
        this.transaction = transaction;
        this.isInactive = isInactive;
        this.seriesStartDate = seriesStartDate;
        this.recurrenceList = recurrenceList;
        this.milestoneList = milestoneList;
    }


    /**
     * Gets the scheduleType value for this BillingSchedule.
     * 
     * @return scheduleType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleType getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this BillingSchedule.
     * 
     * @param scheduleType
     */
    public void setScheduleType(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the name value for this BillingSchedule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BillingSchedule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the recurrencePattern value for this BillingSchedule.
     * 
     * @return recurrencePattern
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrencePattern getRecurrencePattern() {
        return recurrencePattern;
    }


    /**
     * Sets the recurrencePattern value for this BillingSchedule.
     * 
     * @param recurrencePattern
     */
    public void setRecurrencePattern(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrencePattern recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }


    /**
     * Gets the project value for this BillingSchedule.
     * 
     * @return project
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProject() {
        return project;
    }


    /**
     * Sets the project value for this BillingSchedule.
     * 
     * @param project
     */
    public void setProject(com.netsuite.webservices.platform.core_2019_1.RecordRef project) {
        this.project = project;
    }


    /**
     * Gets the initialAmount value for this BillingSchedule.
     * 
     * @return initialAmount
     */
    public java.lang.String getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this BillingSchedule.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(java.lang.String initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the initialTerms value for this BillingSchedule.
     * 
     * @return initialTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInitialTerms() {
        return initialTerms;
    }


    /**
     * Sets the initialTerms value for this BillingSchedule.
     * 
     * @param initialTerms
     */
    public void setInitialTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef initialTerms) {
        this.initialTerms = initialTerms;
    }


    /**
     * Gets the frequency value for this BillingSchedule.
     * 
     * @return frequency
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleFrequency getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this BillingSchedule.
     * 
     * @param frequency
     */
    public void setFrequency(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleFrequency frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the recurrenceDowMaskList value for this BillingSchedule.
     * 
     * @return recurrenceDowMaskList
     */
    public com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList getRecurrenceDowMaskList() {
        return recurrenceDowMaskList;
    }


    /**
     * Sets the recurrenceDowMaskList value for this BillingSchedule.
     * 
     * @param recurrenceDowMaskList
     */
    public void setRecurrenceDowMaskList(com.netsuite.webservices.platform.common_2019_1.RecurrenceDowMaskList recurrenceDowMaskList) {
        this.recurrenceDowMaskList = recurrenceDowMaskList;
    }


    /**
     * Gets the yearMode value for this BillingSchedule.
     * 
     * @return yearMode
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode getYearMode() {
        return yearMode;
    }


    /**
     * Sets the yearMode value for this BillingSchedule.
     * 
     * @param yearMode
     */
    public void setYearMode(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode yearMode) {
        this.yearMode = yearMode;
    }


    /**
     * Gets the yearDowim value for this BillingSchedule.
     * 
     * @return yearDowim
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowim getYearDowim() {
        return yearDowim;
    }


    /**
     * Sets the yearDowim value for this BillingSchedule.
     * 
     * @param yearDowim
     */
    public void setYearDowim(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowim yearDowim) {
        this.yearDowim = yearDowim;
    }


    /**
     * Gets the yearDow value for this BillingSchedule.
     * 
     * @return yearDow
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDow getYearDow() {
        return yearDow;
    }


    /**
     * Sets the yearDow value for this BillingSchedule.
     * 
     * @param yearDow
     */
    public void setYearDow(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDow yearDow) {
        this.yearDow = yearDow;
    }


    /**
     * Gets the yearDowimMonth value for this BillingSchedule.
     * 
     * @return yearDowimMonth
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowimMonth getYearDowimMonth() {
        return yearDowimMonth;
    }


    /**
     * Sets the yearDowimMonth value for this BillingSchedule.
     * 
     * @param yearDowimMonth
     */
    public void setYearDowimMonth(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearDowimMonth yearDowimMonth) {
        this.yearDowimMonth = yearDowimMonth;
    }


    /**
     * Gets the yearMonth value for this BillingSchedule.
     * 
     * @return yearMonth
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearMonth getYearMonth() {
        return yearMonth;
    }


    /**
     * Sets the yearMonth value for this BillingSchedule.
     * 
     * @param yearMonth
     */
    public void setYearMonth(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleYearMonth yearMonth) {
        this.yearMonth = yearMonth;
    }


    /**
     * Gets the yearDom value for this BillingSchedule.
     * 
     * @return yearDom
     */
    public java.lang.Long getYearDom() {
        return yearDom;
    }


    /**
     * Sets the yearDom value for this BillingSchedule.
     * 
     * @param yearDom
     */
    public void setYearDom(java.lang.Long yearDom) {
        this.yearDom = yearDom;
    }


    /**
     * Gets the monthMode value for this BillingSchedule.
     * 
     * @return monthMode
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode getMonthMode() {
        return monthMode;
    }


    /**
     * Sets the monthMode value for this BillingSchedule.
     * 
     * @param monthMode
     */
    public void setMonthMode(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRecurrenceMode monthMode) {
        this.monthMode = monthMode;
    }


    /**
     * Gets the monthDowim value for this BillingSchedule.
     * 
     * @return monthDowim
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDowim getMonthDowim() {
        return monthDowim;
    }


    /**
     * Sets the monthDowim value for this BillingSchedule.
     * 
     * @param monthDowim
     */
    public void setMonthDowim(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDowim monthDowim) {
        this.monthDowim = monthDowim;
    }


    /**
     * Gets the monthDow value for this BillingSchedule.
     * 
     * @return monthDow
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDow getMonthDow() {
        return monthDow;
    }


    /**
     * Sets the monthDow value for this BillingSchedule.
     * 
     * @param monthDow
     */
    public void setMonthDow(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleMonthDow monthDow) {
        this.monthDow = monthDow;
    }


    /**
     * Gets the monthDom value for this BillingSchedule.
     * 
     * @return monthDom
     */
    public java.lang.Long getMonthDom() {
        return monthDom;
    }


    /**
     * Sets the monthDom value for this BillingSchedule.
     * 
     * @param monthDom
     */
    public void setMonthDom(java.lang.Long monthDom) {
        this.monthDom = monthDom;
    }


    /**
     * Gets the dayPeriod value for this BillingSchedule.
     * 
     * @return dayPeriod
     */
    public java.lang.Long getDayPeriod() {
        return dayPeriod;
    }


    /**
     * Sets the dayPeriod value for this BillingSchedule.
     * 
     * @param dayPeriod
     */
    public void setDayPeriod(java.lang.Long dayPeriod) {
        this.dayPeriod = dayPeriod;
    }


    /**
     * Gets the repeatEvery value for this BillingSchedule.
     * 
     * @return repeatEvery
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRepeatEvery getRepeatEvery() {
        return repeatEvery;
    }


    /**
     * Sets the repeatEvery value for this BillingSchedule.
     * 
     * @param repeatEvery
     */
    public void setRepeatEvery(com.netsuite.webservices.lists.accounting_2019_1.types.BillingScheduleRepeatEvery repeatEvery) {
        this.repeatEvery = repeatEvery;
    }


    /**
     * Gets the billForActuals value for this BillingSchedule.
     * 
     * @return billForActuals
     */
    public java.lang.Boolean getBillForActuals() {
        return billForActuals;
    }


    /**
     * Sets the billForActuals value for this BillingSchedule.
     * 
     * @param billForActuals
     */
    public void setBillForActuals(java.lang.Boolean billForActuals) {
        this.billForActuals = billForActuals;
    }


    /**
     * Gets the numberRemaining value for this BillingSchedule.
     * 
     * @return numberRemaining
     */
    public java.lang.Long getNumberRemaining() {
        return numberRemaining;
    }


    /**
     * Sets the numberRemaining value for this BillingSchedule.
     * 
     * @param numberRemaining
     */
    public void setNumberRemaining(java.lang.Long numberRemaining) {
        this.numberRemaining = numberRemaining;
    }


    /**
     * Gets the inArrears value for this BillingSchedule.
     * 
     * @return inArrears
     */
    public java.lang.Boolean getInArrears() {
        return inArrears;
    }


    /**
     * Sets the inArrears value for this BillingSchedule.
     * 
     * @param inArrears
     */
    public void setInArrears(java.lang.Boolean inArrears) {
        this.inArrears = inArrears;
    }


    /**
     * Gets the recurrenceTerms value for this BillingSchedule.
     * 
     * @return recurrenceTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecurrenceTerms() {
        return recurrenceTerms;
    }


    /**
     * Sets the recurrenceTerms value for this BillingSchedule.
     * 
     * @param recurrenceTerms
     */
    public void setRecurrenceTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef recurrenceTerms) {
        this.recurrenceTerms = recurrenceTerms;
    }


    /**
     * Gets the isPublic value for this BillingSchedule.
     * 
     * @return isPublic
     */
    public java.lang.Boolean getIsPublic() {
        return isPublic;
    }


    /**
     * Sets the isPublic value for this BillingSchedule.
     * 
     * @param isPublic
     */
    public void setIsPublic(java.lang.Boolean isPublic) {
        this.isPublic = isPublic;
    }


    /**
     * Gets the applyToSubtotal value for this BillingSchedule.
     * 
     * @return applyToSubtotal
     */
    public java.lang.Boolean getApplyToSubtotal() {
        return applyToSubtotal;
    }


    /**
     * Sets the applyToSubtotal value for this BillingSchedule.
     * 
     * @param applyToSubtotal
     */
    public void setApplyToSubtotal(java.lang.Boolean applyToSubtotal) {
        this.applyToSubtotal = applyToSubtotal;
    }


    /**
     * Gets the transaction value for this BillingSchedule.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this BillingSchedule.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the isInactive value for this BillingSchedule.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this BillingSchedule.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the seriesStartDate value for this BillingSchedule.
     * 
     * @return seriesStartDate
     */
    public java.util.Calendar getSeriesStartDate() {
        return seriesStartDate;
    }


    /**
     * Sets the seriesStartDate value for this BillingSchedule.
     * 
     * @param seriesStartDate
     */
    public void setSeriesStartDate(java.util.Calendar seriesStartDate) {
        this.seriesStartDate = seriesStartDate;
    }


    /**
     * Gets the recurrenceList value for this BillingSchedule.
     * 
     * @return recurrenceList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleRecurrenceList getRecurrenceList() {
        return recurrenceList;
    }


    /**
     * Sets the recurrenceList value for this BillingSchedule.
     * 
     * @param recurrenceList
     */
    public void setRecurrenceList(com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleRecurrenceList recurrenceList) {
        this.recurrenceList = recurrenceList;
    }


    /**
     * Gets the milestoneList value for this BillingSchedule.
     * 
     * @return milestoneList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleMilestoneList getMilestoneList() {
        return milestoneList;
    }


    /**
     * Sets the milestoneList value for this BillingSchedule.
     * 
     * @param milestoneList
     */
    public void setMilestoneList(com.netsuite.webservices.lists.accounting_2019_1.BillingScheduleMilestoneList milestoneList) {
        this.milestoneList = milestoneList;
    }


    /**
     * Gets the internalId value for this BillingSchedule.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BillingSchedule.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this BillingSchedule.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BillingSchedule.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingSchedule)) return false;
        BillingSchedule other = (BillingSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scheduleType==null && other.getScheduleType()==null) || 
             (this.scheduleType!=null &&
              this.scheduleType.equals(other.getScheduleType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.recurrencePattern==null && other.getRecurrencePattern()==null) || 
             (this.recurrencePattern!=null &&
              this.recurrencePattern.equals(other.getRecurrencePattern()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.initialAmount==null && other.getInitialAmount()==null) || 
             (this.initialAmount!=null &&
              this.initialAmount.equals(other.getInitialAmount()))) &&
            ((this.initialTerms==null && other.getInitialTerms()==null) || 
             (this.initialTerms!=null &&
              this.initialTerms.equals(other.getInitialTerms()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.recurrenceDowMaskList==null && other.getRecurrenceDowMaskList()==null) || 
             (this.recurrenceDowMaskList!=null &&
              this.recurrenceDowMaskList.equals(other.getRecurrenceDowMaskList()))) &&
            ((this.yearMode==null && other.getYearMode()==null) || 
             (this.yearMode!=null &&
              this.yearMode.equals(other.getYearMode()))) &&
            ((this.yearDowim==null && other.getYearDowim()==null) || 
             (this.yearDowim!=null &&
              this.yearDowim.equals(other.getYearDowim()))) &&
            ((this.yearDow==null && other.getYearDow()==null) || 
             (this.yearDow!=null &&
              this.yearDow.equals(other.getYearDow()))) &&
            ((this.yearDowimMonth==null && other.getYearDowimMonth()==null) || 
             (this.yearDowimMonth!=null &&
              this.yearDowimMonth.equals(other.getYearDowimMonth()))) &&
            ((this.yearMonth==null && other.getYearMonth()==null) || 
             (this.yearMonth!=null &&
              this.yearMonth.equals(other.getYearMonth()))) &&
            ((this.yearDom==null && other.getYearDom()==null) || 
             (this.yearDom!=null &&
              this.yearDom.equals(other.getYearDom()))) &&
            ((this.monthMode==null && other.getMonthMode()==null) || 
             (this.monthMode!=null &&
              this.monthMode.equals(other.getMonthMode()))) &&
            ((this.monthDowim==null && other.getMonthDowim()==null) || 
             (this.monthDowim!=null &&
              this.monthDowim.equals(other.getMonthDowim()))) &&
            ((this.monthDow==null && other.getMonthDow()==null) || 
             (this.monthDow!=null &&
              this.monthDow.equals(other.getMonthDow()))) &&
            ((this.monthDom==null && other.getMonthDom()==null) || 
             (this.monthDom!=null &&
              this.monthDom.equals(other.getMonthDom()))) &&
            ((this.dayPeriod==null && other.getDayPeriod()==null) || 
             (this.dayPeriod!=null &&
              this.dayPeriod.equals(other.getDayPeriod()))) &&
            ((this.repeatEvery==null && other.getRepeatEvery()==null) || 
             (this.repeatEvery!=null &&
              this.repeatEvery.equals(other.getRepeatEvery()))) &&
            ((this.billForActuals==null && other.getBillForActuals()==null) || 
             (this.billForActuals!=null &&
              this.billForActuals.equals(other.getBillForActuals()))) &&
            ((this.numberRemaining==null && other.getNumberRemaining()==null) || 
             (this.numberRemaining!=null &&
              this.numberRemaining.equals(other.getNumberRemaining()))) &&
            ((this.inArrears==null && other.getInArrears()==null) || 
             (this.inArrears!=null &&
              this.inArrears.equals(other.getInArrears()))) &&
            ((this.recurrenceTerms==null && other.getRecurrenceTerms()==null) || 
             (this.recurrenceTerms!=null &&
              this.recurrenceTerms.equals(other.getRecurrenceTerms()))) &&
            ((this.isPublic==null && other.getIsPublic()==null) || 
             (this.isPublic!=null &&
              this.isPublic.equals(other.getIsPublic()))) &&
            ((this.applyToSubtotal==null && other.getApplyToSubtotal()==null) || 
             (this.applyToSubtotal!=null &&
              this.applyToSubtotal.equals(other.getApplyToSubtotal()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.seriesStartDate==null && other.getSeriesStartDate()==null) || 
             (this.seriesStartDate!=null &&
              this.seriesStartDate.equals(other.getSeriesStartDate()))) &&
            ((this.recurrenceList==null && other.getRecurrenceList()==null) || 
             (this.recurrenceList!=null &&
              this.recurrenceList.equals(other.getRecurrenceList()))) &&
            ((this.milestoneList==null && other.getMilestoneList()==null) || 
             (this.milestoneList!=null &&
              this.milestoneList.equals(other.getMilestoneList()))) &&
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
        if (getScheduleType() != null) {
            _hashCode += getScheduleType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRecurrencePattern() != null) {
            _hashCode += getRecurrencePattern().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getInitialAmount() != null) {
            _hashCode += getInitialAmount().hashCode();
        }
        if (getInitialTerms() != null) {
            _hashCode += getInitialTerms().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getRecurrenceDowMaskList() != null) {
            _hashCode += getRecurrenceDowMaskList().hashCode();
        }
        if (getYearMode() != null) {
            _hashCode += getYearMode().hashCode();
        }
        if (getYearDowim() != null) {
            _hashCode += getYearDowim().hashCode();
        }
        if (getYearDow() != null) {
            _hashCode += getYearDow().hashCode();
        }
        if (getYearDowimMonth() != null) {
            _hashCode += getYearDowimMonth().hashCode();
        }
        if (getYearMonth() != null) {
            _hashCode += getYearMonth().hashCode();
        }
        if (getYearDom() != null) {
            _hashCode += getYearDom().hashCode();
        }
        if (getMonthMode() != null) {
            _hashCode += getMonthMode().hashCode();
        }
        if (getMonthDowim() != null) {
            _hashCode += getMonthDowim().hashCode();
        }
        if (getMonthDow() != null) {
            _hashCode += getMonthDow().hashCode();
        }
        if (getMonthDom() != null) {
            _hashCode += getMonthDom().hashCode();
        }
        if (getDayPeriod() != null) {
            _hashCode += getDayPeriod().hashCode();
        }
        if (getRepeatEvery() != null) {
            _hashCode += getRepeatEvery().hashCode();
        }
        if (getBillForActuals() != null) {
            _hashCode += getBillForActuals().hashCode();
        }
        if (getNumberRemaining() != null) {
            _hashCode += getNumberRemaining().hashCode();
        }
        if (getInArrears() != null) {
            _hashCode += getInArrears().hashCode();
        }
        if (getRecurrenceTerms() != null) {
            _hashCode += getRecurrenceTerms().hashCode();
        }
        if (getIsPublic() != null) {
            _hashCode += getIsPublic().hashCode();
        }
        if (getApplyToSubtotal() != null) {
            _hashCode += getApplyToSubtotal().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getSeriesStartDate() != null) {
            _hashCode += getSeriesStartDate().hashCode();
        }
        if (getRecurrenceList() != null) {
            _hashCode += getRecurrenceList().hashCode();
        }
        if (getMilestoneList() != null) {
            _hashCode += getMilestoneList().hashCode();
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
        new org.apache.axis.description.TypeDesc(BillingSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BillingSchedule"));
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
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "scheduleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrencePattern");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrencePattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRecurrencePattern"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "initialTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDowMaskList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrenceDowMaskList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RecurrenceDowMaskList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "yearMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearDowim");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "yearDowim"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleYearDowim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearDow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "yearDow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleYearDow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearDowimMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "yearDowimMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleYearDowimMonth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "yearMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleYearMonth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearDom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "yearDom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "monthMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthDowim");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "monthDowim"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleMonthDowim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthDow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "monthDow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleMonthDow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthDom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "monthDom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "dayPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatEvery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "repeatEvery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRepeatEvery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billForActuals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "billForActuals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "numberRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inArrears");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inArrears"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrenceTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isPublic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyToSubtotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "applyToSubtotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "seriesStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrenceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "milestoneList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleMilestoneList"));
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
