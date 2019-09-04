/**
 * TermSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TermSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] dateDriven;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dayDiscountExpires;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dayOfMonthNetDue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysUntilExpiry;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysUntilNetDue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountPercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountPercentDateDriven;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dueNextMonthIfWithinDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] preferred;

    public TermSearchRowBasic() {
    }

    public TermSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] dateDriven,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dayDiscountExpires,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dayOfMonthNetDue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysUntilExpiry,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysUntilNetDue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountPercent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountPercentDateDriven,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dueNextMonthIfWithinDays,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] preferred) {
        this.dateDriven = dateDriven;
        this.dayDiscountExpires = dayDiscountExpires;
        this.dayOfMonthNetDue = dayOfMonthNetDue;
        this.daysUntilExpiry = daysUntilExpiry;
        this.daysUntilNetDue = daysUntilNetDue;
        this.discountPercent = discountPercent;
        this.discountPercentDateDriven = discountPercentDateDriven;
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.name = name;
        this.preferred = preferred;
    }


    /**
     * Gets the dateDriven value for this TermSearchRowBasic.
     * 
     * @return dateDriven
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDateDriven() {
        return dateDriven;
    }


    /**
     * Sets the dateDriven value for this TermSearchRowBasic.
     * 
     * @param dateDriven
     */
    public void setDateDriven(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] dateDriven) {
        this.dateDriven = dateDriven;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDateDriven(int i) {
        return this.dateDriven[i];
    }

    public void setDateDriven(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.dateDriven[i] = _value;
    }


    /**
     * Gets the dayDiscountExpires value for this TermSearchRowBasic.
     * 
     * @return dayDiscountExpires
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDayDiscountExpires() {
        return dayDiscountExpires;
    }


    /**
     * Sets the dayDiscountExpires value for this TermSearchRowBasic.
     * 
     * @param dayDiscountExpires
     */
    public void setDayDiscountExpires(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dayDiscountExpires) {
        this.dayDiscountExpires = dayDiscountExpires;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDayDiscountExpires(int i) {
        return this.dayDiscountExpires[i];
    }

    public void setDayDiscountExpires(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.dayDiscountExpires[i] = _value;
    }


    /**
     * Gets the dayOfMonthNetDue value for this TermSearchRowBasic.
     * 
     * @return dayOfMonthNetDue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }


    /**
     * Sets the dayOfMonthNetDue value for this TermSearchRowBasic.
     * 
     * @param dayOfMonthNetDue
     */
    public void setDayOfMonthNetDue(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dayOfMonthNetDue) {
        this.dayOfMonthNetDue = dayOfMonthNetDue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDayOfMonthNetDue(int i) {
        return this.dayOfMonthNetDue[i];
    }

    public void setDayOfMonthNetDue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.dayOfMonthNetDue[i] = _value;
    }


    /**
     * Gets the daysUntilExpiry value for this TermSearchRowBasic.
     * 
     * @return daysUntilExpiry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDaysUntilExpiry() {
        return daysUntilExpiry;
    }


    /**
     * Sets the daysUntilExpiry value for this TermSearchRowBasic.
     * 
     * @param daysUntilExpiry
     */
    public void setDaysUntilExpiry(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysUntilExpiry) {
        this.daysUntilExpiry = daysUntilExpiry;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDaysUntilExpiry(int i) {
        return this.daysUntilExpiry[i];
    }

    public void setDaysUntilExpiry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.daysUntilExpiry[i] = _value;
    }


    /**
     * Gets the daysUntilNetDue value for this TermSearchRowBasic.
     * 
     * @return daysUntilNetDue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDaysUntilNetDue() {
        return daysUntilNetDue;
    }


    /**
     * Sets the daysUntilNetDue value for this TermSearchRowBasic.
     * 
     * @param daysUntilNetDue
     */
    public void setDaysUntilNetDue(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysUntilNetDue) {
        this.daysUntilNetDue = daysUntilNetDue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDaysUntilNetDue(int i) {
        return this.daysUntilNetDue[i];
    }

    public void setDaysUntilNetDue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.daysUntilNetDue[i] = _value;
    }


    /**
     * Gets the discountPercent value for this TermSearchRowBasic.
     * 
     * @return discountPercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDiscountPercent() {
        return discountPercent;
    }


    /**
     * Sets the discountPercent value for this TermSearchRowBasic.
     * 
     * @param discountPercent
     */
    public void setDiscountPercent(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountPercent) {
        this.discountPercent = discountPercent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDiscountPercent(int i) {
        return this.discountPercent[i];
    }

    public void setDiscountPercent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.discountPercent[i] = _value;
    }


    /**
     * Gets the discountPercentDateDriven value for this TermSearchRowBasic.
     * 
     * @return discountPercentDateDriven
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }


    /**
     * Sets the discountPercentDateDriven value for this TermSearchRowBasic.
     * 
     * @param discountPercentDateDriven
     */
    public void setDiscountPercentDateDriven(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountPercentDateDriven) {
        this.discountPercentDateDriven = discountPercentDateDriven;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDiscountPercentDateDriven(int i) {
        return this.discountPercentDateDriven[i];
    }

    public void setDiscountPercentDateDriven(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.discountPercentDateDriven[i] = _value;
    }


    /**
     * Gets the dueNextMonthIfWithinDays value for this TermSearchRowBasic.
     * 
     * @return dueNextMonthIfWithinDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }


    /**
     * Sets the dueNextMonthIfWithinDays value for this TermSearchRowBasic.
     * 
     * @param dueNextMonthIfWithinDays
     */
    public void setDueNextMonthIfWithinDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dueNextMonthIfWithinDays) {
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDueNextMonthIfWithinDays(int i) {
        return this.dueNextMonthIfWithinDays[i];
    }

    public void setDueNextMonthIfWithinDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.dueNextMonthIfWithinDays[i] = _value;
    }


    /**
     * Gets the externalId value for this TermSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TermSearchRowBasic.
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
     * Gets the internalId value for this TermSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TermSearchRowBasic.
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
     * Gets the isInactive value for this TermSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TermSearchRowBasic.
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
     * Gets the name value for this TermSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TermSearchRowBasic.
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
     * Gets the preferred value for this TermSearchRowBasic.
     * 
     * @return preferred
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this TermSearchRowBasic.
     * 
     * @param preferred
     */
    public void setPreferred(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] preferred) {
        this.preferred = preferred;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPreferred(int i) {
        return this.preferred[i];
    }

    public void setPreferred(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.preferred[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TermSearchRowBasic)) return false;
        TermSearchRowBasic other = (TermSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateDriven==null && other.getDateDriven()==null) || 
             (this.dateDriven!=null &&
              java.util.Arrays.equals(this.dateDriven, other.getDateDriven()))) &&
            ((this.dayDiscountExpires==null && other.getDayDiscountExpires()==null) || 
             (this.dayDiscountExpires!=null &&
              java.util.Arrays.equals(this.dayDiscountExpires, other.getDayDiscountExpires()))) &&
            ((this.dayOfMonthNetDue==null && other.getDayOfMonthNetDue()==null) || 
             (this.dayOfMonthNetDue!=null &&
              java.util.Arrays.equals(this.dayOfMonthNetDue, other.getDayOfMonthNetDue()))) &&
            ((this.daysUntilExpiry==null && other.getDaysUntilExpiry()==null) || 
             (this.daysUntilExpiry!=null &&
              java.util.Arrays.equals(this.daysUntilExpiry, other.getDaysUntilExpiry()))) &&
            ((this.daysUntilNetDue==null && other.getDaysUntilNetDue()==null) || 
             (this.daysUntilNetDue!=null &&
              java.util.Arrays.equals(this.daysUntilNetDue, other.getDaysUntilNetDue()))) &&
            ((this.discountPercent==null && other.getDiscountPercent()==null) || 
             (this.discountPercent!=null &&
              java.util.Arrays.equals(this.discountPercent, other.getDiscountPercent()))) &&
            ((this.discountPercentDateDriven==null && other.getDiscountPercentDateDriven()==null) || 
             (this.discountPercentDateDriven!=null &&
              java.util.Arrays.equals(this.discountPercentDateDriven, other.getDiscountPercentDateDriven()))) &&
            ((this.dueNextMonthIfWithinDays==null && other.getDueNextMonthIfWithinDays()==null) || 
             (this.dueNextMonthIfWithinDays!=null &&
              java.util.Arrays.equals(this.dueNextMonthIfWithinDays, other.getDueNextMonthIfWithinDays()))) &&
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
            ((this.preferred==null && other.getPreferred()==null) || 
             (this.preferred!=null &&
              java.util.Arrays.equals(this.preferred, other.getPreferred())));
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
        if (getDateDriven() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateDriven());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateDriven(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDayDiscountExpires() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayDiscountExpires());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDayDiscountExpires(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDayOfMonthNetDue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayOfMonthNetDue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDayOfMonthNetDue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysUntilExpiry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysUntilExpiry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysUntilExpiry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysUntilNetDue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysUntilNetDue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysUntilNetDue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountPercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountPercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountPercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountPercentDateDriven() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountPercentDateDriven());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountPercentDateDriven(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDueNextMonthIfWithinDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDueNextMonthIfWithinDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDueNextMonthIfWithinDays(), i);
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
        if (getPreferred() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferred());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferred(), i);
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
        new org.apache.axis.description.TypeDesc(TermSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TermSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayDiscountExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dayDiscountExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonthNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dayOfMonthNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysUntilExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysUntilNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "discountPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentDateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "discountPercentDateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueNextMonthIfWithinDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferred"));
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
