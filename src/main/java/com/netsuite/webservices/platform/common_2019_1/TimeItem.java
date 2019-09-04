/**
 * TimeItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TimeItem  implements java.io.Serializable {
    private java.lang.Long id;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef employee;

    private com.netsuite.webservices.platform.common_2019_1.types.TimeItemTimeType timeType;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private java.lang.Boolean isBillable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryLocalJurisdiction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryStateJurisdiction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.Duration hours;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef price;

    private java.lang.Double rate;

    private java.lang.Boolean overrideRate;

    private com.netsuite.webservices.platform.core_2019_1.Duration hoursTotal;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef caseTaskEvent;

    private java.lang.String memo;

    private java.lang.Boolean isUtilized;

    private java.lang.Boolean isProductive;

    private java.lang.Boolean isExempt;

    public TimeItem() {
    }

    public TimeItem(
           java.lang.Long id,
           com.netsuite.webservices.platform.core_2019_1.RecordRef employee,
           com.netsuite.webservices.platform.common_2019_1.types.TimeItemTimeType timeType,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           java.lang.Boolean isBillable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryLocalJurisdiction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryStateJurisdiction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.Duration hours,
           com.netsuite.webservices.platform.core_2019_1.RecordRef price,
           java.lang.Double rate,
           java.lang.Boolean overrideRate,
           com.netsuite.webservices.platform.core_2019_1.Duration hoursTotal,
           com.netsuite.webservices.platform.core_2019_1.RecordRef caseTaskEvent,
           java.lang.String memo,
           java.lang.Boolean isUtilized,
           java.lang.Boolean isProductive,
           java.lang.Boolean isExempt) {
           this.id = id;
           this.employee = employee;
           this.timeType = timeType;
           this.tranDate = tranDate;
           this.customer = customer;
           this.isBillable = isBillable;
           this.payrollItem = payrollItem;
           this.item = item;
           this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
           this.temporaryStateJurisdiction = temporaryStateJurisdiction;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.hours = hours;
           this.price = price;
           this.rate = rate;
           this.overrideRate = overrideRate;
           this.hoursTotal = hoursTotal;
           this.caseTaskEvent = caseTaskEvent;
           this.memo = memo;
           this.isUtilized = isUtilized;
           this.isProductive = isProductive;
           this.isExempt = isExempt;
    }


    /**
     * Gets the id value for this TimeItem.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this TimeItem.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the employee value for this TimeItem.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeItem.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.RecordRef employee) {
        this.employee = employee;
    }


    /**
     * Gets the timeType value for this TimeItem.
     * 
     * @return timeType
     */
    public com.netsuite.webservices.platform.common_2019_1.types.TimeItemTimeType getTimeType() {
        return timeType;
    }


    /**
     * Sets the timeType value for this TimeItem.
     * 
     * @param timeType
     */
    public void setTimeType(com.netsuite.webservices.platform.common_2019_1.types.TimeItemTimeType timeType) {
        this.timeType = timeType;
    }


    /**
     * Gets the tranDate value for this TimeItem.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this TimeItem.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the customer value for this TimeItem.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeItem.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the isBillable value for this TimeItem.
     * 
     * @return isBillable
     */
    public java.lang.Boolean getIsBillable() {
        return isBillable;
    }


    /**
     * Sets the isBillable value for this TimeItem.
     * 
     * @param isBillable
     */
    public void setIsBillable(java.lang.Boolean isBillable) {
        this.isBillable = isBillable;
    }


    /**
     * Gets the payrollItem value for this TimeItem.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this TimeItem.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the item value for this TimeItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the temporaryLocalJurisdiction value for this TimeItem.
     * 
     * @return temporaryLocalJurisdiction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTemporaryLocalJurisdiction() {
        return temporaryLocalJurisdiction;
    }


    /**
     * Sets the temporaryLocalJurisdiction value for this TimeItem.
     * 
     * @param temporaryLocalJurisdiction
     */
    public void setTemporaryLocalJurisdiction(com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }


    /**
     * Gets the temporaryStateJurisdiction value for this TimeItem.
     * 
     * @return temporaryStateJurisdiction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTemporaryStateJurisdiction() {
        return temporaryStateJurisdiction;
    }


    /**
     * Sets the temporaryStateJurisdiction value for this TimeItem.
     * 
     * @param temporaryStateJurisdiction
     */
    public void setTemporaryStateJurisdiction(com.netsuite.webservices.platform.core_2019_1.RecordRef temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }


    /**
     * Gets the department value for this TimeItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this TimeItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this TimeItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the hours value for this TimeItem.
     * 
     * @return hours
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this TimeItem.
     * 
     * @param hours
     */
    public void setHours(com.netsuite.webservices.platform.core_2019_1.Duration hours) {
        this.hours = hours;
    }


    /**
     * Gets the price value for this TimeItem.
     * 
     * @return price
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPrice() {
        return price;
    }


    /**
     * Sets the price value for this TimeItem.
     * 
     * @param price
     */
    public void setPrice(com.netsuite.webservices.platform.core_2019_1.RecordRef price) {
        this.price = price;
    }


    /**
     * Gets the rate value for this TimeItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TimeItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the overrideRate value for this TimeItem.
     * 
     * @return overrideRate
     */
    public java.lang.Boolean getOverrideRate() {
        return overrideRate;
    }


    /**
     * Sets the overrideRate value for this TimeItem.
     * 
     * @param overrideRate
     */
    public void setOverrideRate(java.lang.Boolean overrideRate) {
        this.overrideRate = overrideRate;
    }


    /**
     * Gets the hoursTotal value for this TimeItem.
     * 
     * @return hoursTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getHoursTotal() {
        return hoursTotal;
    }


    /**
     * Sets the hoursTotal value for this TimeItem.
     * 
     * @param hoursTotal
     */
    public void setHoursTotal(com.netsuite.webservices.platform.core_2019_1.Duration hoursTotal) {
        this.hoursTotal = hoursTotal;
    }


    /**
     * Gets the caseTaskEvent value for this TimeItem.
     * 
     * @return caseTaskEvent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCaseTaskEvent() {
        return caseTaskEvent;
    }


    /**
     * Sets the caseTaskEvent value for this TimeItem.
     * 
     * @param caseTaskEvent
     */
    public void setCaseTaskEvent(com.netsuite.webservices.platform.core_2019_1.RecordRef caseTaskEvent) {
        this.caseTaskEvent = caseTaskEvent;
    }


    /**
     * Gets the memo value for this TimeItem.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeItem.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the isUtilized value for this TimeItem.
     * 
     * @return isUtilized
     */
    public java.lang.Boolean getIsUtilized() {
        return isUtilized;
    }


    /**
     * Sets the isUtilized value for this TimeItem.
     * 
     * @param isUtilized
     */
    public void setIsUtilized(java.lang.Boolean isUtilized) {
        this.isUtilized = isUtilized;
    }


    /**
     * Gets the isProductive value for this TimeItem.
     * 
     * @return isProductive
     */
    public java.lang.Boolean getIsProductive() {
        return isProductive;
    }


    /**
     * Sets the isProductive value for this TimeItem.
     * 
     * @param isProductive
     */
    public void setIsProductive(java.lang.Boolean isProductive) {
        this.isProductive = isProductive;
    }


    /**
     * Gets the isExempt value for this TimeItem.
     * 
     * @return isExempt
     */
    public java.lang.Boolean getIsExempt() {
        return isExempt;
    }


    /**
     * Sets the isExempt value for this TimeItem.
     * 
     * @param isExempt
     */
    public void setIsExempt(java.lang.Boolean isExempt) {
        this.isExempt = isExempt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeItem)) return false;
        TimeItem other = (TimeItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.timeType==null && other.getTimeType()==null) || 
             (this.timeType!=null &&
              this.timeType.equals(other.getTimeType()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.isBillable==null && other.getIsBillable()==null) || 
             (this.isBillable!=null &&
              this.isBillable.equals(other.getIsBillable()))) &&
            ((this.payrollItem==null && other.getPayrollItem()==null) || 
             (this.payrollItem!=null &&
              this.payrollItem.equals(other.getPayrollItem()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.temporaryLocalJurisdiction==null && other.getTemporaryLocalJurisdiction()==null) || 
             (this.temporaryLocalJurisdiction!=null &&
              this.temporaryLocalJurisdiction.equals(other.getTemporaryLocalJurisdiction()))) &&
            ((this.temporaryStateJurisdiction==null && other.getTemporaryStateJurisdiction()==null) || 
             (this.temporaryStateJurisdiction!=null &&
              this.temporaryStateJurisdiction.equals(other.getTemporaryStateJurisdiction()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              this.hours.equals(other.getHours()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.overrideRate==null && other.getOverrideRate()==null) || 
             (this.overrideRate!=null &&
              this.overrideRate.equals(other.getOverrideRate()))) &&
            ((this.hoursTotal==null && other.getHoursTotal()==null) || 
             (this.hoursTotal!=null &&
              this.hoursTotal.equals(other.getHoursTotal()))) &&
            ((this.caseTaskEvent==null && other.getCaseTaskEvent()==null) || 
             (this.caseTaskEvent!=null &&
              this.caseTaskEvent.equals(other.getCaseTaskEvent()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.isUtilized==null && other.getIsUtilized()==null) || 
             (this.isUtilized!=null &&
              this.isUtilized.equals(other.getIsUtilized()))) &&
            ((this.isProductive==null && other.getIsProductive()==null) || 
             (this.isProductive!=null &&
              this.isProductive.equals(other.getIsProductive()))) &&
            ((this.isExempt==null && other.getIsExempt()==null) || 
             (this.isExempt!=null &&
              this.isExempt.equals(other.getIsExempt())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getTimeType() != null) {
            _hashCode += getTimeType().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getIsBillable() != null) {
            _hashCode += getIsBillable().hashCode();
        }
        if (getPayrollItem() != null) {
            _hashCode += getPayrollItem().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getTemporaryLocalJurisdiction() != null) {
            _hashCode += getTemporaryLocalJurisdiction().hashCode();
        }
        if (getTemporaryStateJurisdiction() != null) {
            _hashCode += getTemporaryStateJurisdiction().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getHours() != null) {
            _hashCode += getHours().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getOverrideRate() != null) {
            _hashCode += getOverrideRate().hashCode();
        }
        if (getHoursTotal() != null) {
            _hashCode += getHoursTotal().hashCode();
        }
        if (getCaseTaskEvent() != null) {
            _hashCode += getCaseTaskEvent().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getIsUtilized() != null) {
            _hashCode += getIsUtilized().hashCode();
        }
        if (getIsProductive() != null) {
            _hashCode += getIsProductive().hashCode();
        }
        if (getIsExempt() != null) {
            _hashCode += getIsExempt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "TimeItemTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overrideRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hoursTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseTaskEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseTaskEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUtilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isUtilized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProductive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isProductive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
