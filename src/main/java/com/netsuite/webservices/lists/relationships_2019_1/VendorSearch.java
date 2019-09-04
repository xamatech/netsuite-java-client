/**
 * VendorSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class VendorSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic accountJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic expAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic mseSubsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic taxRegistrationJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic timeApproverJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public VendorSearch() {
    }

    public VendorSearch(
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic accountJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic expAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic mseSubsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin,
           com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic taxRegistrationJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic timeApproverJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.accountJoin = accountJoin;
        this.campaignResponseJoin = campaignResponseJoin;
        this.contactJoin = contactJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.expAccountJoin = expAccountJoin;
        this.fileJoin = fileJoin;
        this.messagesJoin = messagesJoin;
        this.mseSubsidiaryJoin = mseSubsidiaryJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.taxRegistrationJoin = taxRegistrationJoin;
        this.timeApproverJoin = timeApproverJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this VendorSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this VendorSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the accountJoin value for this VendorSearch.
     * 
     * @return accountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic getAccountJoin() {
        return accountJoin;
    }


    /**
     * Sets the accountJoin value for this VendorSearch.
     * 
     * @param accountJoin
     */
    public void setAccountJoin(com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic accountJoin) {
        this.accountJoin = accountJoin;
    }


    /**
     * Gets the campaignResponseJoin value for this VendorSearch.
     * 
     * @return campaignResponseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }


    /**
     * Sets the campaignResponseJoin value for this VendorSearch.
     * 
     * @param campaignResponseJoin
     */
    public void setCampaignResponseJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }


    /**
     * Gets the contactJoin value for this VendorSearch.
     * 
     * @return contactJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this VendorSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the contactPrimaryJoin value for this VendorSearch.
     * 
     * @return contactPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }


    /**
     * Sets the contactPrimaryJoin value for this VendorSearch.
     * 
     * @param contactPrimaryJoin
     */
    public void setContactPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }


    /**
     * Gets the expAccountJoin value for this VendorSearch.
     * 
     * @return expAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic getExpAccountJoin() {
        return expAccountJoin;
    }


    /**
     * Sets the expAccountJoin value for this VendorSearch.
     * 
     * @param expAccountJoin
     */
    public void setExpAccountJoin(com.netsuite.webservices.platform.common_2019_1.AccountSearchBasic expAccountJoin) {
        this.expAccountJoin = expAccountJoin;
    }


    /**
     * Gets the fileJoin value for this VendorSearch.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this VendorSearch.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the messagesJoin value for this VendorSearch.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this VendorSearch.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the mseSubsidiaryJoin value for this VendorSearch.
     * 
     * @return mseSubsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic getMseSubsidiaryJoin() {
        return mseSubsidiaryJoin;
    }


    /**
     * Sets the mseSubsidiaryJoin value for this VendorSearch.
     * 
     * @param mseSubsidiaryJoin
     */
    public void setMseSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic mseSubsidiaryJoin) {
        this.mseSubsidiaryJoin = mseSubsidiaryJoin;
    }


    /**
     * Gets the messagesFromJoin value for this VendorSearch.
     * 
     * @return messagesFromJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }


    /**
     * Sets the messagesFromJoin value for this VendorSearch.
     * 
     * @param messagesFromJoin
     */
    public void setMessagesFromJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }


    /**
     * Gets the messagesToJoin value for this VendorSearch.
     * 
     * @return messagesToJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesToJoin() {
        return messagesToJoin;
    }


    /**
     * Sets the messagesToJoin value for this VendorSearch.
     * 
     * @param messagesToJoin
     */
    public void setMessagesToJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }


    /**
     * Gets the taxRegistrationJoin value for this VendorSearch.
     * 
     * @return taxRegistrationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic getTaxRegistrationJoin() {
        return taxRegistrationJoin;
    }


    /**
     * Sets the taxRegistrationJoin value for this VendorSearch.
     * 
     * @param taxRegistrationJoin
     */
    public void setTaxRegistrationJoin(com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic taxRegistrationJoin) {
        this.taxRegistrationJoin = taxRegistrationJoin;
    }


    /**
     * Gets the timeApproverJoin value for this VendorSearch.
     * 
     * @return timeApproverJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getTimeApproverJoin() {
        return timeApproverJoin;
    }


    /**
     * Sets the timeApproverJoin value for this VendorSearch.
     * 
     * @param timeApproverJoin
     */
    public void setTimeApproverJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic timeApproverJoin) {
        this.timeApproverJoin = timeApproverJoin;
    }


    /**
     * Gets the transactionJoin value for this VendorSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this VendorSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this VendorSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this VendorSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this VendorSearch.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this VendorSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the customSearchJoin value for this VendorSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this VendorSearch.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorSearch)) return false;
        VendorSearch other = (VendorSearch) obj;
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
            ((this.campaignResponseJoin==null && other.getCampaignResponseJoin()==null) || 
             (this.campaignResponseJoin!=null &&
              this.campaignResponseJoin.equals(other.getCampaignResponseJoin()))) &&
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.contactPrimaryJoin==null && other.getContactPrimaryJoin()==null) || 
             (this.contactPrimaryJoin!=null &&
              this.contactPrimaryJoin.equals(other.getContactPrimaryJoin()))) &&
            ((this.expAccountJoin==null && other.getExpAccountJoin()==null) || 
             (this.expAccountJoin!=null &&
              this.expAccountJoin.equals(other.getExpAccountJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.mseSubsidiaryJoin==null && other.getMseSubsidiaryJoin()==null) || 
             (this.mseSubsidiaryJoin!=null &&
              this.mseSubsidiaryJoin.equals(other.getMseSubsidiaryJoin()))) &&
            ((this.messagesFromJoin==null && other.getMessagesFromJoin()==null) || 
             (this.messagesFromJoin!=null &&
              this.messagesFromJoin.equals(other.getMessagesFromJoin()))) &&
            ((this.messagesToJoin==null && other.getMessagesToJoin()==null) || 
             (this.messagesToJoin!=null &&
              this.messagesToJoin.equals(other.getMessagesToJoin()))) &&
            ((this.taxRegistrationJoin==null && other.getTaxRegistrationJoin()==null) || 
             (this.taxRegistrationJoin!=null &&
              this.taxRegistrationJoin.equals(other.getTaxRegistrationJoin()))) &&
            ((this.timeApproverJoin==null && other.getTimeApproverJoin()==null) || 
             (this.timeApproverJoin!=null &&
              this.timeApproverJoin.equals(other.getTimeApproverJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
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
        if (getAccountJoin() != null) {
            _hashCode += getAccountJoin().hashCode();
        }
        if (getCampaignResponseJoin() != null) {
            _hashCode += getCampaignResponseJoin().hashCode();
        }
        if (getContactJoin() != null) {
            _hashCode += getContactJoin().hashCode();
        }
        if (getContactPrimaryJoin() != null) {
            _hashCode += getContactPrimaryJoin().hashCode();
        }
        if (getExpAccountJoin() != null) {
            _hashCode += getExpAccountJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getMessagesJoin() != null) {
            _hashCode += getMessagesJoin().hashCode();
        }
        if (getMseSubsidiaryJoin() != null) {
            _hashCode += getMseSubsidiaryJoin().hashCode();
        }
        if (getMessagesFromJoin() != null) {
            _hashCode += getMessagesFromJoin().hashCode();
        }
        if (getMessagesToJoin() != null) {
            _hashCode += getMessagesToJoin().hashCode();
        }
        if (getTaxRegistrationJoin() != null) {
            _hashCode += getTaxRegistrationJoin().hashCode();
        }
        if (getTimeApproverJoin() != null) {
            _hashCode += getTimeApproverJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(VendorSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "accountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignResponseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "campaignResponseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "expAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mseSubsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "mseSubsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MseSubsidiarySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesFromJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesFromJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesToJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesToJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeApproverJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "timeApproverJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
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
