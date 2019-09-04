/**
 * BillingScheduleSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BillingScheduleSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] applyToSubtotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] frequency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inArrears;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] initialAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] initialTerms;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPublic;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] recurrenceCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] recurrencePattern;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recurrenceTerms;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] repeatEvery;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type;

    public BillingScheduleSearchRowBasic() {
    }

    public BillingScheduleSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] applyToSubtotal,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] frequency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inArrears,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] initialAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] initialTerms,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPublic,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] recurrenceCount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] recurrencePattern,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recurrenceTerms,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] repeatEvery,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type) {
        this.applyToSubtotal = applyToSubtotal;
        this.externalId = externalId;
        this.frequency = frequency;
        this.inArrears = inArrears;
        this.initialAmount = initialAmount;
        this.initialTerms = initialTerms;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.isPublic = isPublic;
        this.name = name;
        this.recurrenceCount = recurrenceCount;
        this.recurrencePattern = recurrencePattern;
        this.recurrenceTerms = recurrenceTerms;
        this.repeatEvery = repeatEvery;
        this.type = type;
    }


    /**
     * Gets the applyToSubtotal value for this BillingScheduleSearchRowBasic.
     * 
     * @return applyToSubtotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getApplyToSubtotal() {
        return applyToSubtotal;
    }


    /**
     * Sets the applyToSubtotal value for this BillingScheduleSearchRowBasic.
     * 
     * @param applyToSubtotal
     */
    public void setApplyToSubtotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] applyToSubtotal) {
        this.applyToSubtotal = applyToSubtotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getApplyToSubtotal(int i) {
        return this.applyToSubtotal[i];
    }

    public void setApplyToSubtotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.applyToSubtotal[i] = _value;
    }


    /**
     * Gets the externalId value for this BillingScheduleSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BillingScheduleSearchRowBasic.
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
     * Gets the frequency value for this BillingScheduleSearchRowBasic.
     * 
     * @return frequency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this BillingScheduleSearchRowBasic.
     * 
     * @param frequency
     */
    public void setFrequency(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] frequency) {
        this.frequency = frequency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getFrequency(int i) {
        return this.frequency[i];
    }

    public void setFrequency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.frequency[i] = _value;
    }


    /**
     * Gets the inArrears value for this BillingScheduleSearchRowBasic.
     * 
     * @return inArrears
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getInArrears() {
        return inArrears;
    }


    /**
     * Sets the inArrears value for this BillingScheduleSearchRowBasic.
     * 
     * @param inArrears
     */
    public void setInArrears(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inArrears) {
        this.inArrears = inArrears;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getInArrears(int i) {
        return this.inArrears[i];
    }

    public void setInArrears(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.inArrears[i] = _value;
    }


    /**
     * Gets the initialAmount value for this BillingScheduleSearchRowBasic.
     * 
     * @return initialAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this BillingScheduleSearchRowBasic.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] initialAmount) {
        this.initialAmount = initialAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getInitialAmount(int i) {
        return this.initialAmount[i];
    }

    public void setInitialAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.initialAmount[i] = _value;
    }


    /**
     * Gets the initialTerms value for this BillingScheduleSearchRowBasic.
     * 
     * @return initialTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getInitialTerms() {
        return initialTerms;
    }


    /**
     * Sets the initialTerms value for this BillingScheduleSearchRowBasic.
     * 
     * @param initialTerms
     */
    public void setInitialTerms(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] initialTerms) {
        this.initialTerms = initialTerms;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getInitialTerms(int i) {
        return this.initialTerms[i];
    }

    public void setInitialTerms(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.initialTerms[i] = _value;
    }


    /**
     * Gets the internalId value for this BillingScheduleSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BillingScheduleSearchRowBasic.
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
     * Gets the isInactive value for this BillingScheduleSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this BillingScheduleSearchRowBasic.
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
     * Gets the isPublic value for this BillingScheduleSearchRowBasic.
     * 
     * @return isPublic
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsPublic() {
        return isPublic;
    }


    /**
     * Sets the isPublic value for this BillingScheduleSearchRowBasic.
     * 
     * @param isPublic
     */
    public void setIsPublic(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPublic) {
        this.isPublic = isPublic;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsPublic(int i) {
        return this.isPublic[i];
    }

    public void setIsPublic(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isPublic[i] = _value;
    }


    /**
     * Gets the name value for this BillingScheduleSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this BillingScheduleSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the recurrenceCount value for this BillingScheduleSearchRowBasic.
     * 
     * @return recurrenceCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getRecurrenceCount() {
        return recurrenceCount;
    }


    /**
     * Sets the recurrenceCount value for this BillingScheduleSearchRowBasic.
     * 
     * @param recurrenceCount
     */
    public void setRecurrenceCount(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getRecurrenceCount(int i) {
        return this.recurrenceCount[i];
    }

    public void setRecurrenceCount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.recurrenceCount[i] = _value;
    }


    /**
     * Gets the recurrencePattern value for this BillingScheduleSearchRowBasic.
     * 
     * @return recurrencePattern
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getRecurrencePattern() {
        return recurrencePattern;
    }


    /**
     * Sets the recurrencePattern value for this BillingScheduleSearchRowBasic.
     * 
     * @param recurrencePattern
     */
    public void setRecurrencePattern(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getRecurrencePattern(int i) {
        return this.recurrencePattern[i];
    }

    public void setRecurrencePattern(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.recurrencePattern[i] = _value;
    }


    /**
     * Gets the recurrenceTerms value for this BillingScheduleSearchRowBasic.
     * 
     * @return recurrenceTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRecurrenceTerms() {
        return recurrenceTerms;
    }


    /**
     * Sets the recurrenceTerms value for this BillingScheduleSearchRowBasic.
     * 
     * @param recurrenceTerms
     */
    public void setRecurrenceTerms(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recurrenceTerms) {
        this.recurrenceTerms = recurrenceTerms;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRecurrenceTerms(int i) {
        return this.recurrenceTerms[i];
    }

    public void setRecurrenceTerms(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.recurrenceTerms[i] = _value;
    }


    /**
     * Gets the repeatEvery value for this BillingScheduleSearchRowBasic.
     * 
     * @return repeatEvery
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getRepeatEvery() {
        return repeatEvery;
    }


    /**
     * Sets the repeatEvery value for this BillingScheduleSearchRowBasic.
     * 
     * @param repeatEvery
     */
    public void setRepeatEvery(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] repeatEvery) {
        this.repeatEvery = repeatEvery;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getRepeatEvery(int i) {
        return this.repeatEvery[i];
    }

    public void setRepeatEvery(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.repeatEvery[i] = _value;
    }


    /**
     * Gets the type value for this BillingScheduleSearchRowBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this BillingScheduleSearchRowBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingScheduleSearchRowBasic)) return false;
        BillingScheduleSearchRowBasic other = (BillingScheduleSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applyToSubtotal==null && other.getApplyToSubtotal()==null) || 
             (this.applyToSubtotal!=null &&
              java.util.Arrays.equals(this.applyToSubtotal, other.getApplyToSubtotal()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              java.util.Arrays.equals(this.frequency, other.getFrequency()))) &&
            ((this.inArrears==null && other.getInArrears()==null) || 
             (this.inArrears!=null &&
              java.util.Arrays.equals(this.inArrears, other.getInArrears()))) &&
            ((this.initialAmount==null && other.getInitialAmount()==null) || 
             (this.initialAmount!=null &&
              java.util.Arrays.equals(this.initialAmount, other.getInitialAmount()))) &&
            ((this.initialTerms==null && other.getInitialTerms()==null) || 
             (this.initialTerms!=null &&
              java.util.Arrays.equals(this.initialTerms, other.getInitialTerms()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isPublic==null && other.getIsPublic()==null) || 
             (this.isPublic!=null &&
              java.util.Arrays.equals(this.isPublic, other.getIsPublic()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.recurrenceCount==null && other.getRecurrenceCount()==null) || 
             (this.recurrenceCount!=null &&
              java.util.Arrays.equals(this.recurrenceCount, other.getRecurrenceCount()))) &&
            ((this.recurrencePattern==null && other.getRecurrencePattern()==null) || 
             (this.recurrencePattern!=null &&
              java.util.Arrays.equals(this.recurrencePattern, other.getRecurrencePattern()))) &&
            ((this.recurrenceTerms==null && other.getRecurrenceTerms()==null) || 
             (this.recurrenceTerms!=null &&
              java.util.Arrays.equals(this.recurrenceTerms, other.getRecurrenceTerms()))) &&
            ((this.repeatEvery==null && other.getRepeatEvery()==null) || 
             (this.repeatEvery!=null &&
              java.util.Arrays.equals(this.repeatEvery, other.getRepeatEvery()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType())));
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
        if (getApplyToSubtotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyToSubtotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyToSubtotal(), i);
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
        if (getFrequency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInArrears() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInArrears());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInArrears(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInitialAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInitialAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInitialAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInitialTerms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInitialTerms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInitialTerms(), i);
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
        if (getIsPublic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsPublic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsPublic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurrenceCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurrenceCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurrenceCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurrencePattern() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurrencePattern());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurrencePattern(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurrenceTerms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurrenceTerms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurrenceTerms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepeatEvery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepeatEvery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepeatEvery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
        new org.apache.axis.description.TypeDesc(BillingScheduleSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingScheduleSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyToSubtotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyToSubtotal"));
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
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inArrears");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inArrears"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "initialTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPublic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrenceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrencePattern");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrencePattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrenceTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatEvery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "repeatEvery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
