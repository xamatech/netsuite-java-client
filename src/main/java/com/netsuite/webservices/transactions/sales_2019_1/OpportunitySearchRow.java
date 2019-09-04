/**
 * OpportunitySearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class OpportunitySearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic actualJoin;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic decisionMakerJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic estimateJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic orderJoin;

    private com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic originatingLeadJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public OpportunitySearchRow() {
    }

    public OpportunitySearchRow(
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic actualJoin,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic decisionMakerJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic estimateJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic orderJoin,
           com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic originatingLeadJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.actualJoin = actualJoin;
        this.callJoin = callJoin;
        this.customerJoin = customerJoin;
        this.decisionMakerJoin = decisionMakerJoin;
        this.estimateJoin = estimateJoin;
        this.eventJoin = eventJoin;
        this.fileJoin = fileJoin;
        this.itemJoin = itemJoin;
        this.leadSourceJoin = leadSourceJoin;
        this.messagesJoin = messagesJoin;
        this.orderJoin = orderJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.partnerJoin = partnerJoin;
        this.salesRepJoin = salesRepJoin;
        this.taskJoin = taskJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this OpportunitySearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this OpportunitySearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the actualJoin value for this OpportunitySearchRow.
     * 
     * @return actualJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getActualJoin() {
        return actualJoin;
    }


    /**
     * Sets the actualJoin value for this OpportunitySearchRow.
     * 
     * @param actualJoin
     */
    public void setActualJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic actualJoin) {
        this.actualJoin = actualJoin;
    }


    /**
     * Gets the callJoin value for this OpportunitySearchRow.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this OpportunitySearchRow.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the customerJoin value for this OpportunitySearchRow.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this OpportunitySearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the decisionMakerJoin value for this OpportunitySearchRow.
     * 
     * @return decisionMakerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic getDecisionMakerJoin() {
        return decisionMakerJoin;
    }


    /**
     * Sets the decisionMakerJoin value for this OpportunitySearchRow.
     * 
     * @param decisionMakerJoin
     */
    public void setDecisionMakerJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic decisionMakerJoin) {
        this.decisionMakerJoin = decisionMakerJoin;
    }


    /**
     * Gets the estimateJoin value for this OpportunitySearchRow.
     * 
     * @return estimateJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getEstimateJoin() {
        return estimateJoin;
    }


    /**
     * Sets the estimateJoin value for this OpportunitySearchRow.
     * 
     * @param estimateJoin
     */
    public void setEstimateJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic estimateJoin) {
        this.estimateJoin = estimateJoin;
    }


    /**
     * Gets the eventJoin value for this OpportunitySearchRow.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this OpportunitySearchRow.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the fileJoin value for this OpportunitySearchRow.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this OpportunitySearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the itemJoin value for this OpportunitySearchRow.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this OpportunitySearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the leadSourceJoin value for this OpportunitySearchRow.
     * 
     * @return leadSourceJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }


    /**
     * Sets the leadSourceJoin value for this OpportunitySearchRow.
     * 
     * @param leadSourceJoin
     */
    public void setLeadSourceJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
    }


    /**
     * Gets the messagesJoin value for this OpportunitySearchRow.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this OpportunitySearchRow.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the orderJoin value for this OpportunitySearchRow.
     * 
     * @return orderJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getOrderJoin() {
        return orderJoin;
    }


    /**
     * Sets the orderJoin value for this OpportunitySearchRow.
     * 
     * @param orderJoin
     */
    public void setOrderJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic orderJoin) {
        this.orderJoin = orderJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this OpportunitySearchRow.
     * 
     * @return originatingLeadJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this OpportunitySearchRow.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the partnerJoin value for this OpportunitySearchRow.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this OpportunitySearchRow.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the salesRepJoin value for this OpportunitySearchRow.
     * 
     * @return salesRepJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getSalesRepJoin() {
        return salesRepJoin;
    }


    /**
     * Sets the salesRepJoin value for this OpportunitySearchRow.
     * 
     * @param salesRepJoin
     */
    public void setSalesRepJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }


    /**
     * Gets the taskJoin value for this OpportunitySearchRow.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this OpportunitySearchRow.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the userNotesJoin value for this OpportunitySearchRow.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this OpportunitySearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the customSearchJoin value for this OpportunitySearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this OpportunitySearchRow.
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
        if (!(obj instanceof OpportunitySearchRow)) return false;
        OpportunitySearchRow other = (OpportunitySearchRow) obj;
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
            ((this.actualJoin==null && other.getActualJoin()==null) || 
             (this.actualJoin!=null &&
              this.actualJoin.equals(other.getActualJoin()))) &&
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.decisionMakerJoin==null && other.getDecisionMakerJoin()==null) || 
             (this.decisionMakerJoin!=null &&
              this.decisionMakerJoin.equals(other.getDecisionMakerJoin()))) &&
            ((this.estimateJoin==null && other.getEstimateJoin()==null) || 
             (this.estimateJoin!=null &&
              this.estimateJoin.equals(other.getEstimateJoin()))) &&
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.leadSourceJoin==null && other.getLeadSourceJoin()==null) || 
             (this.leadSourceJoin!=null &&
              this.leadSourceJoin.equals(other.getLeadSourceJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.orderJoin==null && other.getOrderJoin()==null) || 
             (this.orderJoin!=null &&
              this.orderJoin.equals(other.getOrderJoin()))) &&
            ((this.originatingLeadJoin==null && other.getOriginatingLeadJoin()==null) || 
             (this.originatingLeadJoin!=null &&
              this.originatingLeadJoin.equals(other.getOriginatingLeadJoin()))) &&
            ((this.partnerJoin==null && other.getPartnerJoin()==null) || 
             (this.partnerJoin!=null &&
              this.partnerJoin.equals(other.getPartnerJoin()))) &&
            ((this.salesRepJoin==null && other.getSalesRepJoin()==null) || 
             (this.salesRepJoin!=null &&
              this.salesRepJoin.equals(other.getSalesRepJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
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
        if (getActualJoin() != null) {
            _hashCode += getActualJoin().hashCode();
        }
        if (getCallJoin() != null) {
            _hashCode += getCallJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getDecisionMakerJoin() != null) {
            _hashCode += getDecisionMakerJoin().hashCode();
        }
        if (getEstimateJoin() != null) {
            _hashCode += getEstimateJoin().hashCode();
        }
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getLeadSourceJoin() != null) {
            _hashCode += getLeadSourceJoin().hashCode();
        }
        if (getMessagesJoin() != null) {
            _hashCode += getMessagesJoin().hashCode();
        }
        if (getOrderJoin() != null) {
            _hashCode += getOrderJoin().hashCode();
        }
        if (getOriginatingLeadJoin() != null) {
            _hashCode += getOriginatingLeadJoin().hashCode();
        }
        if (getPartnerJoin() != null) {
            _hashCode += getPartnerJoin().hashCode();
        }
        if (getSalesRepJoin() != null) {
            _hashCode += getSalesRepJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(OpportunitySearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "OpportunitySearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "actualJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
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
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionMakerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "decisionMakerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimateJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "estimateJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
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
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
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
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
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
        elemField.setFieldName("orderJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "orderJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
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
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
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
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
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
