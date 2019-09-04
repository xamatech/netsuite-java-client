/**
 * RevRecTemplateSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class RevRecTemplateSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorStartOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorTermSrc;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contraAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] deferralAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] periodOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] targetAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useForeignAmounts;

    public RevRecTemplateSearchRowBasic() {
    }

    public RevRecTemplateSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorMethod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorStartOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorTermSrc,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contraAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] deferralAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] periodOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] targetAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useForeignAmounts) {
        this.amorMethod = amorMethod;
        this.amorPeriod = amorPeriod;
        this.amorStartOffset = amorStartOffset;
        this.amorTermSrc = amorTermSrc;
        this.amorType = amorType;
        this.contraAccount = contraAccount;
        this.deferralAccount = deferralAccount;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.name = name;
        this.periodOffset = periodOffset;
        this.targetAccount = targetAccount;
        this.useForeignAmounts = useForeignAmounts;
    }


    /**
     * Gets the amorMethod value for this RevRecTemplateSearchRowBasic.
     * 
     * @return amorMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAmorMethod() {
        return amorMethod;
    }


    /**
     * Sets the amorMethod value for this RevRecTemplateSearchRowBasic.
     * 
     * @param amorMethod
     */
    public void setAmorMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorMethod) {
        this.amorMethod = amorMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAmorMethod(int i) {
        return this.amorMethod[i];
    }

    public void setAmorMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.amorMethod[i] = _value;
    }


    /**
     * Gets the amorPeriod value for this RevRecTemplateSearchRowBasic.
     * 
     * @return amorPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAmorPeriod() {
        return amorPeriod;
    }


    /**
     * Sets the amorPeriod value for this RevRecTemplateSearchRowBasic.
     * 
     * @param amorPeriod
     */
    public void setAmorPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorPeriod) {
        this.amorPeriod = amorPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAmorPeriod(int i) {
        return this.amorPeriod[i];
    }

    public void setAmorPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.amorPeriod[i] = _value;
    }


    /**
     * Gets the amorStartOffset value for this RevRecTemplateSearchRowBasic.
     * 
     * @return amorStartOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAmorStartOffset() {
        return amorStartOffset;
    }


    /**
     * Sets the amorStartOffset value for this RevRecTemplateSearchRowBasic.
     * 
     * @param amorStartOffset
     */
    public void setAmorStartOffset(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorStartOffset) {
        this.amorStartOffset = amorStartOffset;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAmorStartOffset(int i) {
        return this.amorStartOffset[i];
    }

    public void setAmorStartOffset(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.amorStartOffset[i] = _value;
    }


    /**
     * Gets the amorTermSrc value for this RevRecTemplateSearchRowBasic.
     * 
     * @return amorTermSrc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAmorTermSrc() {
        return amorTermSrc;
    }


    /**
     * Sets the amorTermSrc value for this RevRecTemplateSearchRowBasic.
     * 
     * @param amorTermSrc
     */
    public void setAmorTermSrc(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorTermSrc) {
        this.amorTermSrc = amorTermSrc;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAmorTermSrc(int i) {
        return this.amorTermSrc[i];
    }

    public void setAmorTermSrc(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.amorTermSrc[i] = _value;
    }


    /**
     * Gets the amorType value for this RevRecTemplateSearchRowBasic.
     * 
     * @return amorType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAmorType() {
        return amorType;
    }


    /**
     * Sets the amorType value for this RevRecTemplateSearchRowBasic.
     * 
     * @param amorType
     */
    public void setAmorType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] amorType) {
        this.amorType = amorType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAmorType(int i) {
        return this.amorType[i];
    }

    public void setAmorType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.amorType[i] = _value;
    }


    /**
     * Gets the contraAccount value for this RevRecTemplateSearchRowBasic.
     * 
     * @return contraAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getContraAccount() {
        return contraAccount;
    }


    /**
     * Sets the contraAccount value for this RevRecTemplateSearchRowBasic.
     * 
     * @param contraAccount
     */
    public void setContraAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contraAccount) {
        this.contraAccount = contraAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getContraAccount(int i) {
        return this.contraAccount[i];
    }

    public void setContraAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.contraAccount[i] = _value;
    }


    /**
     * Gets the deferralAccount value for this RevRecTemplateSearchRowBasic.
     * 
     * @return deferralAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDeferralAccount() {
        return deferralAccount;
    }


    /**
     * Sets the deferralAccount value for this RevRecTemplateSearchRowBasic.
     * 
     * @param deferralAccount
     */
    public void setDeferralAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] deferralAccount) {
        this.deferralAccount = deferralAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDeferralAccount(int i) {
        return this.deferralAccount[i];
    }

    public void setDeferralAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.deferralAccount[i] = _value;
    }


    /**
     * Gets the externalId value for this RevRecTemplateSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this RevRecTemplateSearchRowBasic.
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
     * Gets the internalId value for this RevRecTemplateSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this RevRecTemplateSearchRowBasic.
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
     * Gets the isInactive value for this RevRecTemplateSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this RevRecTemplateSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the name value for this RevRecTemplateSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this RevRecTemplateSearchRowBasic.
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
     * Gets the periodOffset value for this RevRecTemplateSearchRowBasic.
     * 
     * @return periodOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPeriodOffset() {
        return periodOffset;
    }


    /**
     * Sets the periodOffset value for this RevRecTemplateSearchRowBasic.
     * 
     * @param periodOffset
     */
    public void setPeriodOffset(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] periodOffset) {
        this.periodOffset = periodOffset;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPeriodOffset(int i) {
        return this.periodOffset[i];
    }

    public void setPeriodOffset(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.periodOffset[i] = _value;
    }


    /**
     * Gets the targetAccount value for this RevRecTemplateSearchRowBasic.
     * 
     * @return targetAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTargetAccount() {
        return targetAccount;
    }


    /**
     * Sets the targetAccount value for this RevRecTemplateSearchRowBasic.
     * 
     * @param targetAccount
     */
    public void setTargetAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] targetAccount) {
        this.targetAccount = targetAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTargetAccount(int i) {
        return this.targetAccount[i];
    }

    public void setTargetAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.targetAccount[i] = _value;
    }


    /**
     * Gets the useForeignAmounts value for this RevRecTemplateSearchRowBasic.
     * 
     * @return useForeignAmounts
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUseForeignAmounts() {
        return useForeignAmounts;
    }


    /**
     * Sets the useForeignAmounts value for this RevRecTemplateSearchRowBasic.
     * 
     * @param useForeignAmounts
     */
    public void setUseForeignAmounts(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUseForeignAmounts(int i) {
        return this.useForeignAmounts[i];
    }

    public void setUseForeignAmounts(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.useForeignAmounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecTemplateSearchRowBasic)) return false;
        RevRecTemplateSearchRowBasic other = (RevRecTemplateSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amorMethod==null && other.getAmorMethod()==null) || 
             (this.amorMethod!=null &&
              java.util.Arrays.equals(this.amorMethod, other.getAmorMethod()))) &&
            ((this.amorPeriod==null && other.getAmorPeriod()==null) || 
             (this.amorPeriod!=null &&
              java.util.Arrays.equals(this.amorPeriod, other.getAmorPeriod()))) &&
            ((this.amorStartOffset==null && other.getAmorStartOffset()==null) || 
             (this.amorStartOffset!=null &&
              java.util.Arrays.equals(this.amorStartOffset, other.getAmorStartOffset()))) &&
            ((this.amorTermSrc==null && other.getAmorTermSrc()==null) || 
             (this.amorTermSrc!=null &&
              java.util.Arrays.equals(this.amorTermSrc, other.getAmorTermSrc()))) &&
            ((this.amorType==null && other.getAmorType()==null) || 
             (this.amorType!=null &&
              java.util.Arrays.equals(this.amorType, other.getAmorType()))) &&
            ((this.contraAccount==null && other.getContraAccount()==null) || 
             (this.contraAccount!=null &&
              java.util.Arrays.equals(this.contraAccount, other.getContraAccount()))) &&
            ((this.deferralAccount==null && other.getDeferralAccount()==null) || 
             (this.deferralAccount!=null &&
              java.util.Arrays.equals(this.deferralAccount, other.getDeferralAccount()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.periodOffset==null && other.getPeriodOffset()==null) || 
             (this.periodOffset!=null &&
              java.util.Arrays.equals(this.periodOffset, other.getPeriodOffset()))) &&
            ((this.targetAccount==null && other.getTargetAccount()==null) || 
             (this.targetAccount!=null &&
              java.util.Arrays.equals(this.targetAccount, other.getTargetAccount()))) &&
            ((this.useForeignAmounts==null && other.getUseForeignAmounts()==null) || 
             (this.useForeignAmounts!=null &&
              java.util.Arrays.equals(this.useForeignAmounts, other.getUseForeignAmounts())));
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
        if (getAmorMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmorPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmorStartOffset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorStartOffset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorStartOffset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmorTermSrc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorTermSrc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorTermSrc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmorType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContraAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContraAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContraAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferralAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferralAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferralAccount(), i);
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
        if (getPeriodOffset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodOffset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodOffset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseForeignAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseForeignAmounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseForeignAmounts(), i);
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
        new org.apache.axis.description.TypeDesc(RevRecTemplateSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RevRecTemplateSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorStartOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorStartOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorTermSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorTermSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contraAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferralAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferralAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "targetAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
