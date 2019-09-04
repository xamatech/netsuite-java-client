/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class Contact  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String entityId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef contactSource;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef company;

    private java.lang.String salutation;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    private java.lang.String title;

    private java.lang.String phone;

    private java.lang.String fax;

    private java.lang.String email;

    private java.lang.String defaultAddress;

    private java.lang.Boolean isPrivate;

    private java.lang.Boolean isInactive;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private java.lang.String phoneticName;

    private com.netsuite.webservices.lists.relationships_2019_1.CategoryList categoryList;

    private java.lang.String altEmail;

    private java.lang.String officePhone;

    private java.lang.String homePhone;

    private java.lang.String mobilePhone;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef supervisor;

    private java.lang.String supervisorPhone;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef assistant;

    private java.lang.String assistantPhone;

    private java.lang.String comments;

    private com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef image;

    private java.lang.Boolean billPay;

    private java.util.Calendar dateCreated;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.lists.relationships_2019_1.ContactAddressbookList addressbookList;

    private com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Contact() {
    }

    public Contact(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String entityId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef contactSource,
           com.netsuite.webservices.platform.core_2019_1.RecordRef company,
           java.lang.String salutation,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String title,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String defaultAddress,
           java.lang.Boolean isPrivate,
           java.lang.Boolean isInactive,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           java.lang.String phoneticName,
           com.netsuite.webservices.lists.relationships_2019_1.CategoryList categoryList,
           java.lang.String altEmail,
           java.lang.String officePhone,
           java.lang.String homePhone,
           java.lang.String mobilePhone,
           com.netsuite.webservices.platform.core_2019_1.RecordRef supervisor,
           java.lang.String supervisorPhone,
           com.netsuite.webservices.platform.core_2019_1.RecordRef assistant,
           java.lang.String assistantPhone,
           java.lang.String comments,
           com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef image,
           java.lang.Boolean billPay,
           java.util.Calendar dateCreated,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.lists.relationships_2019_1.ContactAddressbookList addressbookList,
           com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.contactSource = contactSource;
        this.company = company;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.defaultAddress = defaultAddress;
        this.isPrivate = isPrivate;
        this.isInactive = isInactive;
        this.subsidiary = subsidiary;
        this.phoneticName = phoneticName;
        this.categoryList = categoryList;
        this.altEmail = altEmail;
        this.officePhone = officePhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.supervisor = supervisor;
        this.supervisorPhone = supervisorPhone;
        this.assistant = assistant;
        this.assistantPhone = assistantPhone;
        this.comments = comments;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.billPay = billPay;
        this.dateCreated = dateCreated;
        this.lastModifiedDate = lastModifiedDate;
        this.addressbookList = addressbookList;
        this.subscriptionsList = subscriptionsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Contact.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Contact.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entityId value for this Contact.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this Contact.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the contactSource value for this Contact.
     * 
     * @return contactSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getContactSource() {
        return contactSource;
    }


    /**
     * Sets the contactSource value for this Contact.
     * 
     * @param contactSource
     */
    public void setContactSource(com.netsuite.webservices.platform.core_2019_1.RecordRef contactSource) {
        this.contactSource = contactSource;
    }


    /**
     * Gets the company value for this Contact.
     * 
     * @return company
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Contact.
     * 
     * @param company
     */
    public void setCompany(com.netsuite.webservices.platform.core_2019_1.RecordRef company) {
        this.company = company;
    }


    /**
     * Gets the salutation value for this Contact.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Contact.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the firstName value for this Contact.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Contact.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this Contact.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Contact.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this Contact.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Contact.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the title value for this Contact.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Contact.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the phone value for this Contact.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Contact.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this Contact.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Contact.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Contact.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Contact.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the defaultAddress value for this Contact.
     * 
     * @return defaultAddress
     */
    public java.lang.String getDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this Contact.
     * 
     * @param defaultAddress
     */
    public void setDefaultAddress(java.lang.String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the isPrivate value for this Contact.
     * 
     * @return isPrivate
     */
    public java.lang.Boolean getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this Contact.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(java.lang.Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the isInactive value for this Contact.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Contact.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the subsidiary value for this Contact.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Contact.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the phoneticName value for this Contact.
     * 
     * @return phoneticName
     */
    public java.lang.String getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this Contact.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(java.lang.String phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the categoryList value for this Contact.
     * 
     * @return categoryList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CategoryList getCategoryList() {
        return categoryList;
    }


    /**
     * Sets the categoryList value for this Contact.
     * 
     * @param categoryList
     */
    public void setCategoryList(com.netsuite.webservices.lists.relationships_2019_1.CategoryList categoryList) {
        this.categoryList = categoryList;
    }


    /**
     * Gets the altEmail value for this Contact.
     * 
     * @return altEmail
     */
    public java.lang.String getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this Contact.
     * 
     * @param altEmail
     */
    public void setAltEmail(java.lang.String altEmail) {
        this.altEmail = altEmail;
    }


    /**
     * Gets the officePhone value for this Contact.
     * 
     * @return officePhone
     */
    public java.lang.String getOfficePhone() {
        return officePhone;
    }


    /**
     * Sets the officePhone value for this Contact.
     * 
     * @param officePhone
     */
    public void setOfficePhone(java.lang.String officePhone) {
        this.officePhone = officePhone;
    }


    /**
     * Gets the homePhone value for this Contact.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Contact.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the mobilePhone value for this Contact.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Contact.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the supervisor value for this Contact.
     * 
     * @return supervisor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this Contact.
     * 
     * @param supervisor
     */
    public void setSupervisor(com.netsuite.webservices.platform.core_2019_1.RecordRef supervisor) {
        this.supervisor = supervisor;
    }


    /**
     * Gets the supervisorPhone value for this Contact.
     * 
     * @return supervisorPhone
     */
    public java.lang.String getSupervisorPhone() {
        return supervisorPhone;
    }


    /**
     * Sets the supervisorPhone value for this Contact.
     * 
     * @param supervisorPhone
     */
    public void setSupervisorPhone(java.lang.String supervisorPhone) {
        this.supervisorPhone = supervisorPhone;
    }


    /**
     * Gets the assistant value for this Contact.
     * 
     * @return assistant
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAssistant() {
        return assistant;
    }


    /**
     * Sets the assistant value for this Contact.
     * 
     * @param assistant
     */
    public void setAssistant(com.netsuite.webservices.platform.core_2019_1.RecordRef assistant) {
        this.assistant = assistant;
    }


    /**
     * Gets the assistantPhone value for this Contact.
     * 
     * @return assistantPhone
     */
    public java.lang.String getAssistantPhone() {
        return assistantPhone;
    }


    /**
     * Sets the assistantPhone value for this Contact.
     * 
     * @param assistantPhone
     */
    public void setAssistantPhone(java.lang.String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }


    /**
     * Gets the comments value for this Contact.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Contact.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the globalSubscriptionStatus value for this Contact.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this Contact.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the image value for this Contact.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getImage() {
        return image;
    }


    /**
     * Sets the image value for this Contact.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.RecordRef image) {
        this.image = image;
    }


    /**
     * Gets the billPay value for this Contact.
     * 
     * @return billPay
     */
    public java.lang.Boolean getBillPay() {
        return billPay;
    }


    /**
     * Sets the billPay value for this Contact.
     * 
     * @param billPay
     */
    public void setBillPay(java.lang.Boolean billPay) {
        this.billPay = billPay;
    }


    /**
     * Gets the dateCreated value for this Contact.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Contact.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the lastModifiedDate value for this Contact.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Contact.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the addressbookList value for this Contact.
     * 
     * @return addressbookList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.ContactAddressbookList getAddressbookList() {
        return addressbookList;
    }


    /**
     * Sets the addressbookList value for this Contact.
     * 
     * @param addressbookList
     */
    public void setAddressbookList(com.netsuite.webservices.lists.relationships_2019_1.ContactAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }


    /**
     * Gets the subscriptionsList value for this Contact.
     * 
     * @return subscriptionsList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }


    /**
     * Sets the subscriptionsList value for this Contact.
     * 
     * @param subscriptionsList
     */
    public void setSubscriptionsList(com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }


    /**
     * Gets the customFieldList value for this Contact.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Contact.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Contact.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Contact.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Contact.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Contact.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.contactSource==null && other.getContactSource()==null) || 
             (this.contactSource!=null &&
              this.contactSource.equals(other.getContactSource()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.defaultAddress==null && other.getDefaultAddress()==null) || 
             (this.defaultAddress!=null &&
              this.defaultAddress.equals(other.getDefaultAddress()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.categoryList==null && other.getCategoryList()==null) || 
             (this.categoryList!=null &&
              this.categoryList.equals(other.getCategoryList()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              this.altEmail.equals(other.getAltEmail()))) &&
            ((this.officePhone==null && other.getOfficePhone()==null) || 
             (this.officePhone!=null &&
              this.officePhone.equals(other.getOfficePhone()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              this.supervisor.equals(other.getSupervisor()))) &&
            ((this.supervisorPhone==null && other.getSupervisorPhone()==null) || 
             (this.supervisorPhone!=null &&
              this.supervisorPhone.equals(other.getSupervisorPhone()))) &&
            ((this.assistant==null && other.getAssistant()==null) || 
             (this.assistant!=null &&
              this.assistant.equals(other.getAssistant()))) &&
            ((this.assistantPhone==null && other.getAssistantPhone()==null) || 
             (this.assistantPhone!=null &&
              this.assistantPhone.equals(other.getAssistantPhone()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.billPay==null && other.getBillPay()==null) || 
             (this.billPay!=null &&
              this.billPay.equals(other.getBillPay()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.addressbookList==null && other.getAddressbookList()==null) || 
             (this.addressbookList!=null &&
              this.addressbookList.equals(other.getAddressbookList()))) &&
            ((this.subscriptionsList==null && other.getSubscriptionsList()==null) || 
             (this.subscriptionsList!=null &&
              this.subscriptionsList.equals(other.getSubscriptionsList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getContactSource() != null) {
            _hashCode += getContactSource().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getDefaultAddress() != null) {
            _hashCode += getDefaultAddress().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getCategoryList() != null) {
            _hashCode += getCategoryList().hashCode();
        }
        if (getAltEmail() != null) {
            _hashCode += getAltEmail().hashCode();
        }
        if (getOfficePhone() != null) {
            _hashCode += getOfficePhone().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getSupervisor() != null) {
            _hashCode += getSupervisor().hashCode();
        }
        if (getSupervisorPhone() != null) {
            _hashCode += getSupervisorPhone().hashCode();
        }
        if (getAssistant() != null) {
            _hashCode += getAssistant().hashCode();
        }
        if (getAssistantPhone() != null) {
            _hashCode += getAssistantPhone().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getBillPay() != null) {
            _hashCode += getBillPay().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getAddressbookList() != null) {
            _hashCode += getAddressbookList().hashCode();
        }
        if (getSubscriptionsList() != null) {
            _hashCode += getSubscriptionsList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "Contact"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "categoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "officePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "supervisorPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "assistant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistantPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "assistantPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subscriptionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "SubscriptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
