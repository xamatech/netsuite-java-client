/**
 * TermSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TermSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField dateDriven;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField dayDiscountExpires;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField dayOfMonthNetDue;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField daysUntilExpiry;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField daysUntilNetDue;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField discountPercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField discountPercentDateDriven;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField dueNextMonthIfWithinDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField preferred;

    public TermSearchBasic() {
    }

    public TermSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField dateDriven,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField dayDiscountExpires,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField dayOfMonthNetDue,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField daysUntilExpiry,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField daysUntilNetDue,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField discountPercent,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField discountPercentDateDriven,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField dueNextMonthIfWithinDays,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField preferred) {
        this.dateDriven = dateDriven;
        this.dayDiscountExpires = dayDiscountExpires;
        this.dayOfMonthNetDue = dayOfMonthNetDue;
        this.daysUntilExpiry = daysUntilExpiry;
        this.daysUntilNetDue = daysUntilNetDue;
        this.discountPercent = discountPercent;
        this.discountPercentDateDriven = discountPercentDateDriven;
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.name = name;
        this.preferred = preferred;
    }


    /**
     * Gets the dateDriven value for this TermSearchBasic.
     * 
     * @return dateDriven
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getDateDriven() {
        return dateDriven;
    }


    /**
     * Sets the dateDriven value for this TermSearchBasic.
     * 
     * @param dateDriven
     */
    public void setDateDriven(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField dateDriven) {
        this.dateDriven = dateDriven;
    }


    /**
     * Gets the dayDiscountExpires value for this TermSearchBasic.
     * 
     * @return dayDiscountExpires
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDayDiscountExpires() {
        return dayDiscountExpires;
    }


    /**
     * Sets the dayDiscountExpires value for this TermSearchBasic.
     * 
     * @param dayDiscountExpires
     */
    public void setDayDiscountExpires(com.netsuite.webservices.platform.core_2019_1.SearchLongField dayDiscountExpires) {
        this.dayDiscountExpires = dayDiscountExpires;
    }


    /**
     * Gets the dayOfMonthNetDue value for this TermSearchBasic.
     * 
     * @return dayOfMonthNetDue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }


    /**
     * Sets the dayOfMonthNetDue value for this TermSearchBasic.
     * 
     * @param dayOfMonthNetDue
     */
    public void setDayOfMonthNetDue(com.netsuite.webservices.platform.core_2019_1.SearchLongField dayOfMonthNetDue) {
        this.dayOfMonthNetDue = dayOfMonthNetDue;
    }


    /**
     * Gets the daysUntilExpiry value for this TermSearchBasic.
     * 
     * @return daysUntilExpiry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDaysUntilExpiry() {
        return daysUntilExpiry;
    }


    /**
     * Sets the daysUntilExpiry value for this TermSearchBasic.
     * 
     * @param daysUntilExpiry
     */
    public void setDaysUntilExpiry(com.netsuite.webservices.platform.core_2019_1.SearchLongField daysUntilExpiry) {
        this.daysUntilExpiry = daysUntilExpiry;
    }


    /**
     * Gets the daysUntilNetDue value for this TermSearchBasic.
     * 
     * @return daysUntilNetDue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDaysUntilNetDue() {
        return daysUntilNetDue;
    }


    /**
     * Sets the daysUntilNetDue value for this TermSearchBasic.
     * 
     * @param daysUntilNetDue
     */
    public void setDaysUntilNetDue(com.netsuite.webservices.platform.core_2019_1.SearchLongField daysUntilNetDue) {
        this.daysUntilNetDue = daysUntilNetDue;
    }


    /**
     * Gets the discountPercent value for this TermSearchBasic.
     * 
     * @return discountPercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDiscountPercent() {
        return discountPercent;
    }


    /**
     * Sets the discountPercent value for this TermSearchBasic.
     * 
     * @param discountPercent
     */
    public void setDiscountPercent(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField discountPercent) {
        this.discountPercent = discountPercent;
    }


    /**
     * Gets the discountPercentDateDriven value for this TermSearchBasic.
     * 
     * @return discountPercentDateDriven
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }


    /**
     * Sets the discountPercentDateDriven value for this TermSearchBasic.
     * 
     * @param discountPercentDateDriven
     */
    public void setDiscountPercentDateDriven(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField discountPercentDateDriven) {
        this.discountPercentDateDriven = discountPercentDateDriven;
    }


    /**
     * Gets the dueNextMonthIfWithinDays value for this TermSearchBasic.
     * 
     * @return dueNextMonthIfWithinDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }


    /**
     * Sets the dueNextMonthIfWithinDays value for this TermSearchBasic.
     * 
     * @param dueNextMonthIfWithinDays
     */
    public void setDueNextMonthIfWithinDays(com.netsuite.webservices.platform.core_2019_1.SearchLongField dueNextMonthIfWithinDays) {
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
    }


    /**
     * Gets the externalId value for this TermSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TermSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TermSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TermSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this TermSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TermSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TermSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TermSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this TermSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TermSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the name value for this TermSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this TermSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the preferred value for this TermSearchBasic.
     * 
     * @return preferred
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this TermSearchBasic.
     * 
     * @param preferred
     */
    public void setPreferred(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField preferred) {
        this.preferred = preferred;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TermSearchBasic)) return false;
        TermSearchBasic other = (TermSearchBasic) obj;
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
              this.dateDriven.equals(other.getDateDriven()))) &&
            ((this.dayDiscountExpires==null && other.getDayDiscountExpires()==null) || 
             (this.dayDiscountExpires!=null &&
              this.dayDiscountExpires.equals(other.getDayDiscountExpires()))) &&
            ((this.dayOfMonthNetDue==null && other.getDayOfMonthNetDue()==null) || 
             (this.dayOfMonthNetDue!=null &&
              this.dayOfMonthNetDue.equals(other.getDayOfMonthNetDue()))) &&
            ((this.daysUntilExpiry==null && other.getDaysUntilExpiry()==null) || 
             (this.daysUntilExpiry!=null &&
              this.daysUntilExpiry.equals(other.getDaysUntilExpiry()))) &&
            ((this.daysUntilNetDue==null && other.getDaysUntilNetDue()==null) || 
             (this.daysUntilNetDue!=null &&
              this.daysUntilNetDue.equals(other.getDaysUntilNetDue()))) &&
            ((this.discountPercent==null && other.getDiscountPercent()==null) || 
             (this.discountPercent!=null &&
              this.discountPercent.equals(other.getDiscountPercent()))) &&
            ((this.discountPercentDateDriven==null && other.getDiscountPercentDateDriven()==null) || 
             (this.discountPercentDateDriven!=null &&
              this.discountPercentDateDriven.equals(other.getDiscountPercentDateDriven()))) &&
            ((this.dueNextMonthIfWithinDays==null && other.getDueNextMonthIfWithinDays()==null) || 
             (this.dueNextMonthIfWithinDays!=null &&
              this.dueNextMonthIfWithinDays.equals(other.getDueNextMonthIfWithinDays()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.preferred==null && other.getPreferred()==null) || 
             (this.preferred!=null &&
              this.preferred.equals(other.getPreferred())));
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
            _hashCode += getDateDriven().hashCode();
        }
        if (getDayDiscountExpires() != null) {
            _hashCode += getDayDiscountExpires().hashCode();
        }
        if (getDayOfMonthNetDue() != null) {
            _hashCode += getDayOfMonthNetDue().hashCode();
        }
        if (getDaysUntilExpiry() != null) {
            _hashCode += getDaysUntilExpiry().hashCode();
        }
        if (getDaysUntilNetDue() != null) {
            _hashCode += getDaysUntilNetDue().hashCode();
        }
        if (getDiscountPercent() != null) {
            _hashCode += getDiscountPercent().hashCode();
        }
        if (getDiscountPercentDateDriven() != null) {
            _hashCode += getDiscountPercentDateDriven().hashCode();
        }
        if (getDueNextMonthIfWithinDays() != null) {
            _hashCode += getDueNextMonthIfWithinDays().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPreferred() != null) {
            _hashCode += getPreferred().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TermSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TermSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayDiscountExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dayDiscountExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonthNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dayOfMonthNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysUntilExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysUntilNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "discountPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentDateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "discountPercentDateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueNextMonthIfWithinDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "preferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
