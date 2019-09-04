/**
 * Issue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class Issue  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String issueNumber;

    private java.util.Calendar createdDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef product;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef module;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef productTeam;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef source;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef reportedBy;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef reproduce;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef versionBroken;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef buildBroken;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef versionTarget;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef buildTarget;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef versionFixed;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef buildFixed;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef severity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef priority;

    private java.lang.Boolean isShowStopper;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef assigned;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef reviewer;

    private java.lang.Boolean isReviewed;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueStatus;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList issueTagsList;

    private java.lang.String issueAbstract;

    private java.lang.String newDetails;

    private java.lang.Boolean isOwner;

    private com.netsuite.webservices.lists.support_2019_1.types.IssueTrackCode trackCode;

    private java.lang.Boolean emailAssignee;

    private com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList emailEmployeesList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList emailCellsList;

    private java.lang.String externalAbstract;

    private java.lang.String externalDetails;

    private com.netsuite.webservices.lists.support_2019_1.IssueVersionList brokenInVersionList;

    private com.netsuite.webservices.lists.support_2019_1.IssueVersionList targetVersionList;

    private com.netsuite.webservices.lists.support_2019_1.IssueVersionList fixedInVersionList;

    private com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssuesList relatedIssuesList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Issue() {
    }

    public Issue(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String issueNumber,
           java.util.Calendar createdDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef product,
           com.netsuite.webservices.platform.core_2019_1.RecordRef module,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef productTeam,
           com.netsuite.webservices.platform.core_2019_1.RecordRef source,
           com.netsuite.webservices.platform.core_2019_1.RecordRef reportedBy,
           com.netsuite.webservices.platform.core_2019_1.RecordRef reproduce,
           com.netsuite.webservices.platform.core_2019_1.RecordRef versionBroken,
           com.netsuite.webservices.platform.core_2019_1.RecordRef buildBroken,
           com.netsuite.webservices.platform.core_2019_1.RecordRef versionTarget,
           com.netsuite.webservices.platform.core_2019_1.RecordRef buildTarget,
           com.netsuite.webservices.platform.core_2019_1.RecordRef versionFixed,
           com.netsuite.webservices.platform.core_2019_1.RecordRef buildFixed,
           com.netsuite.webservices.platform.core_2019_1.RecordRef severity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef priority,
           java.lang.Boolean isShowStopper,
           com.netsuite.webservices.platform.core_2019_1.RecordRef assigned,
           com.netsuite.webservices.platform.core_2019_1.RecordRef reviewer,
           java.lang.Boolean isReviewed,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueStatus,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList issueTagsList,
           java.lang.String issueAbstract,
           java.lang.String newDetails,
           java.lang.Boolean isOwner,
           com.netsuite.webservices.lists.support_2019_1.types.IssueTrackCode trackCode,
           java.lang.Boolean emailAssignee,
           com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList emailEmployeesList,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList emailCellsList,
           java.lang.String externalAbstract,
           java.lang.String externalDetails,
           com.netsuite.webservices.lists.support_2019_1.IssueVersionList brokenInVersionList,
           com.netsuite.webservices.lists.support_2019_1.IssueVersionList targetVersionList,
           com.netsuite.webservices.lists.support_2019_1.IssueVersionList fixedInVersionList,
           com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssuesList relatedIssuesList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.issueNumber = issueNumber;
        this.createdDate = createdDate;
        this.issueType = issueType;
        this.product = product;
        this.module = module;
        this.item = item;
        this.productTeam = productTeam;
        this.source = source;
        this.reportedBy = reportedBy;
        this.reproduce = reproduce;
        this.versionBroken = versionBroken;
        this.buildBroken = buildBroken;
        this.versionTarget = versionTarget;
        this.buildTarget = buildTarget;
        this.versionFixed = versionFixed;
        this.buildFixed = buildFixed;
        this.severity = severity;
        this.priority = priority;
        this.isShowStopper = isShowStopper;
        this.assigned = assigned;
        this.reviewer = reviewer;
        this.isReviewed = isReviewed;
        this.issueStatus = issueStatus;
        this.lastModifiedDate = lastModifiedDate;
        this.issueTagsList = issueTagsList;
        this.issueAbstract = issueAbstract;
        this.newDetails = newDetails;
        this.isOwner = isOwner;
        this.trackCode = trackCode;
        this.emailAssignee = emailAssignee;
        this.emailEmployeesList = emailEmployeesList;
        this.emailCellsList = emailCellsList;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.brokenInVersionList = brokenInVersionList;
        this.targetVersionList = targetVersionList;
        this.fixedInVersionList = fixedInVersionList;
        this.relatedIssuesList = relatedIssuesList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Issue.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Issue.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the issueNumber value for this Issue.
     * 
     * @return issueNumber
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this Issue.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the createdDate value for this Issue.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Issue.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the issueType value for this Issue.
     * 
     * @return issueType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueType() {
        return issueType;
    }


    /**
     * Sets the issueType value for this Issue.
     * 
     * @param issueType
     */
    public void setIssueType(com.netsuite.webservices.platform.core_2019_1.RecordRef issueType) {
        this.issueType = issueType;
    }


    /**
     * Gets the product value for this Issue.
     * 
     * @return product
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProduct() {
        return product;
    }


    /**
     * Sets the product value for this Issue.
     * 
     * @param product
     */
    public void setProduct(com.netsuite.webservices.platform.core_2019_1.RecordRef product) {
        this.product = product;
    }


    /**
     * Gets the module value for this Issue.
     * 
     * @return module
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getModule() {
        return module;
    }


    /**
     * Sets the module value for this Issue.
     * 
     * @param module
     */
    public void setModule(com.netsuite.webservices.platform.core_2019_1.RecordRef module) {
        this.module = module;
    }


    /**
     * Gets the item value for this Issue.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this Issue.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the productTeam value for this Issue.
     * 
     * @return productTeam
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProductTeam() {
        return productTeam;
    }


    /**
     * Sets the productTeam value for this Issue.
     * 
     * @param productTeam
     */
    public void setProductTeam(com.netsuite.webservices.platform.core_2019_1.RecordRef productTeam) {
        this.productTeam = productTeam;
    }


    /**
     * Gets the source value for this Issue.
     * 
     * @return source
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSource() {
        return source;
    }


    /**
     * Sets the source value for this Issue.
     * 
     * @param source
     */
    public void setSource(com.netsuite.webservices.platform.core_2019_1.RecordRef source) {
        this.source = source;
    }


    /**
     * Gets the reportedBy value for this Issue.
     * 
     * @return reportedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getReportedBy() {
        return reportedBy;
    }


    /**
     * Sets the reportedBy value for this Issue.
     * 
     * @param reportedBy
     */
    public void setReportedBy(com.netsuite.webservices.platform.core_2019_1.RecordRef reportedBy) {
        this.reportedBy = reportedBy;
    }


    /**
     * Gets the reproduce value for this Issue.
     * 
     * @return reproduce
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getReproduce() {
        return reproduce;
    }


    /**
     * Sets the reproduce value for this Issue.
     * 
     * @param reproduce
     */
    public void setReproduce(com.netsuite.webservices.platform.core_2019_1.RecordRef reproduce) {
        this.reproduce = reproduce;
    }


    /**
     * Gets the versionBroken value for this Issue.
     * 
     * @return versionBroken
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVersionBroken() {
        return versionBroken;
    }


    /**
     * Sets the versionBroken value for this Issue.
     * 
     * @param versionBroken
     */
    public void setVersionBroken(com.netsuite.webservices.platform.core_2019_1.RecordRef versionBroken) {
        this.versionBroken = versionBroken;
    }


    /**
     * Gets the buildBroken value for this Issue.
     * 
     * @return buildBroken
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBuildBroken() {
        return buildBroken;
    }


    /**
     * Sets the buildBroken value for this Issue.
     * 
     * @param buildBroken
     */
    public void setBuildBroken(com.netsuite.webservices.platform.core_2019_1.RecordRef buildBroken) {
        this.buildBroken = buildBroken;
    }


    /**
     * Gets the versionTarget value for this Issue.
     * 
     * @return versionTarget
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVersionTarget() {
        return versionTarget;
    }


    /**
     * Sets the versionTarget value for this Issue.
     * 
     * @param versionTarget
     */
    public void setVersionTarget(com.netsuite.webservices.platform.core_2019_1.RecordRef versionTarget) {
        this.versionTarget = versionTarget;
    }


    /**
     * Gets the buildTarget value for this Issue.
     * 
     * @return buildTarget
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBuildTarget() {
        return buildTarget;
    }


    /**
     * Sets the buildTarget value for this Issue.
     * 
     * @param buildTarget
     */
    public void setBuildTarget(com.netsuite.webservices.platform.core_2019_1.RecordRef buildTarget) {
        this.buildTarget = buildTarget;
    }


    /**
     * Gets the versionFixed value for this Issue.
     * 
     * @return versionFixed
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVersionFixed() {
        return versionFixed;
    }


    /**
     * Sets the versionFixed value for this Issue.
     * 
     * @param versionFixed
     */
    public void setVersionFixed(com.netsuite.webservices.platform.core_2019_1.RecordRef versionFixed) {
        this.versionFixed = versionFixed;
    }


    /**
     * Gets the buildFixed value for this Issue.
     * 
     * @return buildFixed
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBuildFixed() {
        return buildFixed;
    }


    /**
     * Sets the buildFixed value for this Issue.
     * 
     * @param buildFixed
     */
    public void setBuildFixed(com.netsuite.webservices.platform.core_2019_1.RecordRef buildFixed) {
        this.buildFixed = buildFixed;
    }


    /**
     * Gets the severity value for this Issue.
     * 
     * @return severity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Issue.
     * 
     * @param severity
     */
    public void setSeverity(com.netsuite.webservices.platform.core_2019_1.RecordRef severity) {
        this.severity = severity;
    }


    /**
     * Gets the priority value for this Issue.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Issue.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.RecordRef priority) {
        this.priority = priority;
    }


    /**
     * Gets the isShowStopper value for this Issue.
     * 
     * @return isShowStopper
     */
    public java.lang.Boolean getIsShowStopper() {
        return isShowStopper;
    }


    /**
     * Sets the isShowStopper value for this Issue.
     * 
     * @param isShowStopper
     */
    public void setIsShowStopper(java.lang.Boolean isShowStopper) {
        this.isShowStopper = isShowStopper;
    }


    /**
     * Gets the assigned value for this Issue.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this Issue.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.RecordRef assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the reviewer value for this Issue.
     * 
     * @return reviewer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getReviewer() {
        return reviewer;
    }


    /**
     * Sets the reviewer value for this Issue.
     * 
     * @param reviewer
     */
    public void setReviewer(com.netsuite.webservices.platform.core_2019_1.RecordRef reviewer) {
        this.reviewer = reviewer;
    }


    /**
     * Gets the isReviewed value for this Issue.
     * 
     * @return isReviewed
     */
    public java.lang.Boolean getIsReviewed() {
        return isReviewed;
    }


    /**
     * Sets the isReviewed value for this Issue.
     * 
     * @param isReviewed
     */
    public void setIsReviewed(java.lang.Boolean isReviewed) {
        this.isReviewed = isReviewed;
    }


    /**
     * Gets the issueStatus value for this Issue.
     * 
     * @return issueStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueStatus() {
        return issueStatus;
    }


    /**
     * Sets the issueStatus value for this Issue.
     * 
     * @param issueStatus
     */
    public void setIssueStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef issueStatus) {
        this.issueStatus = issueStatus;
    }


    /**
     * Gets the lastModifiedDate value for this Issue.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Issue.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the issueTagsList value for this Issue.
     * 
     * @return issueTagsList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getIssueTagsList() {
        return issueTagsList;
    }


    /**
     * Sets the issueTagsList value for this Issue.
     * 
     * @param issueTagsList
     */
    public void setIssueTagsList(com.netsuite.webservices.platform.core_2019_1.RecordRefList issueTagsList) {
        this.issueTagsList = issueTagsList;
    }


    /**
     * Gets the issueAbstract value for this Issue.
     * 
     * @return issueAbstract
     */
    public java.lang.String getIssueAbstract() {
        return issueAbstract;
    }


    /**
     * Sets the issueAbstract value for this Issue.
     * 
     * @param issueAbstract
     */
    public void setIssueAbstract(java.lang.String issueAbstract) {
        this.issueAbstract = issueAbstract;
    }


    /**
     * Gets the newDetails value for this Issue.
     * 
     * @return newDetails
     */
    public java.lang.String getNewDetails() {
        return newDetails;
    }


    /**
     * Sets the newDetails value for this Issue.
     * 
     * @param newDetails
     */
    public void setNewDetails(java.lang.String newDetails) {
        this.newDetails = newDetails;
    }


    /**
     * Gets the isOwner value for this Issue.
     * 
     * @return isOwner
     */
    public java.lang.Boolean getIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this Issue.
     * 
     * @param isOwner
     */
    public void setIsOwner(java.lang.Boolean isOwner) {
        this.isOwner = isOwner;
    }


    /**
     * Gets the trackCode value for this Issue.
     * 
     * @return trackCode
     */
    public com.netsuite.webservices.lists.support_2019_1.types.IssueTrackCode getTrackCode() {
        return trackCode;
    }


    /**
     * Sets the trackCode value for this Issue.
     * 
     * @param trackCode
     */
    public void setTrackCode(com.netsuite.webservices.lists.support_2019_1.types.IssueTrackCode trackCode) {
        this.trackCode = trackCode;
    }


    /**
     * Gets the emailAssignee value for this Issue.
     * 
     * @return emailAssignee
     */
    public java.lang.Boolean getEmailAssignee() {
        return emailAssignee;
    }


    /**
     * Sets the emailAssignee value for this Issue.
     * 
     * @param emailAssignee
     */
    public void setEmailAssignee(java.lang.Boolean emailAssignee) {
        this.emailAssignee = emailAssignee;
    }


    /**
     * Gets the emailEmployeesList value for this Issue.
     * 
     * @return emailEmployeesList
     */
    public com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList getEmailEmployeesList() {
        return emailEmployeesList;
    }


    /**
     * Sets the emailEmployeesList value for this Issue.
     * 
     * @param emailEmployeesList
     */
    public void setEmailEmployeesList(com.netsuite.webservices.lists.support_2019_1.EmailEmployeesList emailEmployeesList) {
        this.emailEmployeesList = emailEmployeesList;
    }


    /**
     * Gets the emailCellsList value for this Issue.
     * 
     * @return emailCellsList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getEmailCellsList() {
        return emailCellsList;
    }


    /**
     * Sets the emailCellsList value for this Issue.
     * 
     * @param emailCellsList
     */
    public void setEmailCellsList(com.netsuite.webservices.platform.core_2019_1.RecordRefList emailCellsList) {
        this.emailCellsList = emailCellsList;
    }


    /**
     * Gets the externalAbstract value for this Issue.
     * 
     * @return externalAbstract
     */
    public java.lang.String getExternalAbstract() {
        return externalAbstract;
    }


    /**
     * Sets the externalAbstract value for this Issue.
     * 
     * @param externalAbstract
     */
    public void setExternalAbstract(java.lang.String externalAbstract) {
        this.externalAbstract = externalAbstract;
    }


    /**
     * Gets the externalDetails value for this Issue.
     * 
     * @return externalDetails
     */
    public java.lang.String getExternalDetails() {
        return externalDetails;
    }


    /**
     * Sets the externalDetails value for this Issue.
     * 
     * @param externalDetails
     */
    public void setExternalDetails(java.lang.String externalDetails) {
        this.externalDetails = externalDetails;
    }


    /**
     * Gets the brokenInVersionList value for this Issue.
     * 
     * @return brokenInVersionList
     */
    public com.netsuite.webservices.lists.support_2019_1.IssueVersionList getBrokenInVersionList() {
        return brokenInVersionList;
    }


    /**
     * Sets the brokenInVersionList value for this Issue.
     * 
     * @param brokenInVersionList
     */
    public void setBrokenInVersionList(com.netsuite.webservices.lists.support_2019_1.IssueVersionList brokenInVersionList) {
        this.brokenInVersionList = brokenInVersionList;
    }


    /**
     * Gets the targetVersionList value for this Issue.
     * 
     * @return targetVersionList
     */
    public com.netsuite.webservices.lists.support_2019_1.IssueVersionList getTargetVersionList() {
        return targetVersionList;
    }


    /**
     * Sets the targetVersionList value for this Issue.
     * 
     * @param targetVersionList
     */
    public void setTargetVersionList(com.netsuite.webservices.lists.support_2019_1.IssueVersionList targetVersionList) {
        this.targetVersionList = targetVersionList;
    }


    /**
     * Gets the fixedInVersionList value for this Issue.
     * 
     * @return fixedInVersionList
     */
    public com.netsuite.webservices.lists.support_2019_1.IssueVersionList getFixedInVersionList() {
        return fixedInVersionList;
    }


    /**
     * Sets the fixedInVersionList value for this Issue.
     * 
     * @param fixedInVersionList
     */
    public void setFixedInVersionList(com.netsuite.webservices.lists.support_2019_1.IssueVersionList fixedInVersionList) {
        this.fixedInVersionList = fixedInVersionList;
    }


    /**
     * Gets the relatedIssuesList value for this Issue.
     * 
     * @return relatedIssuesList
     */
    public com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssuesList getRelatedIssuesList() {
        return relatedIssuesList;
    }


    /**
     * Sets the relatedIssuesList value for this Issue.
     * 
     * @param relatedIssuesList
     */
    public void setRelatedIssuesList(com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssuesList relatedIssuesList) {
        this.relatedIssuesList = relatedIssuesList;
    }


    /**
     * Gets the customFieldList value for this Issue.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Issue.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Issue.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Issue.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Issue.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Issue.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Issue)) return false;
        Issue other = (Issue) obj;
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
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.issueType==null && other.getIssueType()==null) || 
             (this.issueType!=null &&
              this.issueType.equals(other.getIssueType()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.productTeam==null && other.getProductTeam()==null) || 
             (this.productTeam!=null &&
              this.productTeam.equals(other.getProductTeam()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.reportedBy==null && other.getReportedBy()==null) || 
             (this.reportedBy!=null &&
              this.reportedBy.equals(other.getReportedBy()))) &&
            ((this.reproduce==null && other.getReproduce()==null) || 
             (this.reproduce!=null &&
              this.reproduce.equals(other.getReproduce()))) &&
            ((this.versionBroken==null && other.getVersionBroken()==null) || 
             (this.versionBroken!=null &&
              this.versionBroken.equals(other.getVersionBroken()))) &&
            ((this.buildBroken==null && other.getBuildBroken()==null) || 
             (this.buildBroken!=null &&
              this.buildBroken.equals(other.getBuildBroken()))) &&
            ((this.versionTarget==null && other.getVersionTarget()==null) || 
             (this.versionTarget!=null &&
              this.versionTarget.equals(other.getVersionTarget()))) &&
            ((this.buildTarget==null && other.getBuildTarget()==null) || 
             (this.buildTarget!=null &&
              this.buildTarget.equals(other.getBuildTarget()))) &&
            ((this.versionFixed==null && other.getVersionFixed()==null) || 
             (this.versionFixed!=null &&
              this.versionFixed.equals(other.getVersionFixed()))) &&
            ((this.buildFixed==null && other.getBuildFixed()==null) || 
             (this.buildFixed!=null &&
              this.buildFixed.equals(other.getBuildFixed()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.isShowStopper==null && other.getIsShowStopper()==null) || 
             (this.isShowStopper!=null &&
              this.isShowStopper.equals(other.getIsShowStopper()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.reviewer==null && other.getReviewer()==null) || 
             (this.reviewer!=null &&
              this.reviewer.equals(other.getReviewer()))) &&
            ((this.isReviewed==null && other.getIsReviewed()==null) || 
             (this.isReviewed!=null &&
              this.isReviewed.equals(other.getIsReviewed()))) &&
            ((this.issueStatus==null && other.getIssueStatus()==null) || 
             (this.issueStatus!=null &&
              this.issueStatus.equals(other.getIssueStatus()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.issueTagsList==null && other.getIssueTagsList()==null) || 
             (this.issueTagsList!=null &&
              this.issueTagsList.equals(other.getIssueTagsList()))) &&
            ((this.issueAbstract==null && other.getIssueAbstract()==null) || 
             (this.issueAbstract!=null &&
              this.issueAbstract.equals(other.getIssueAbstract()))) &&
            ((this.newDetails==null && other.getNewDetails()==null) || 
             (this.newDetails!=null &&
              this.newDetails.equals(other.getNewDetails()))) &&
            ((this.isOwner==null && other.getIsOwner()==null) || 
             (this.isOwner!=null &&
              this.isOwner.equals(other.getIsOwner()))) &&
            ((this.trackCode==null && other.getTrackCode()==null) || 
             (this.trackCode!=null &&
              this.trackCode.equals(other.getTrackCode()))) &&
            ((this.emailAssignee==null && other.getEmailAssignee()==null) || 
             (this.emailAssignee!=null &&
              this.emailAssignee.equals(other.getEmailAssignee()))) &&
            ((this.emailEmployeesList==null && other.getEmailEmployeesList()==null) || 
             (this.emailEmployeesList!=null &&
              this.emailEmployeesList.equals(other.getEmailEmployeesList()))) &&
            ((this.emailCellsList==null && other.getEmailCellsList()==null) || 
             (this.emailCellsList!=null &&
              this.emailCellsList.equals(other.getEmailCellsList()))) &&
            ((this.externalAbstract==null && other.getExternalAbstract()==null) || 
             (this.externalAbstract!=null &&
              this.externalAbstract.equals(other.getExternalAbstract()))) &&
            ((this.externalDetails==null && other.getExternalDetails()==null) || 
             (this.externalDetails!=null &&
              this.externalDetails.equals(other.getExternalDetails()))) &&
            ((this.brokenInVersionList==null && other.getBrokenInVersionList()==null) || 
             (this.brokenInVersionList!=null &&
              this.brokenInVersionList.equals(other.getBrokenInVersionList()))) &&
            ((this.targetVersionList==null && other.getTargetVersionList()==null) || 
             (this.targetVersionList!=null &&
              this.targetVersionList.equals(other.getTargetVersionList()))) &&
            ((this.fixedInVersionList==null && other.getFixedInVersionList()==null) || 
             (this.fixedInVersionList!=null &&
              this.fixedInVersionList.equals(other.getFixedInVersionList()))) &&
            ((this.relatedIssuesList==null && other.getRelatedIssuesList()==null) || 
             (this.relatedIssuesList!=null &&
              this.relatedIssuesList.equals(other.getRelatedIssuesList()))) &&
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
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getIssueType() != null) {
            _hashCode += getIssueType().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getProductTeam() != null) {
            _hashCode += getProductTeam().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getReportedBy() != null) {
            _hashCode += getReportedBy().hashCode();
        }
        if (getReproduce() != null) {
            _hashCode += getReproduce().hashCode();
        }
        if (getVersionBroken() != null) {
            _hashCode += getVersionBroken().hashCode();
        }
        if (getBuildBroken() != null) {
            _hashCode += getBuildBroken().hashCode();
        }
        if (getVersionTarget() != null) {
            _hashCode += getVersionTarget().hashCode();
        }
        if (getBuildTarget() != null) {
            _hashCode += getBuildTarget().hashCode();
        }
        if (getVersionFixed() != null) {
            _hashCode += getVersionFixed().hashCode();
        }
        if (getBuildFixed() != null) {
            _hashCode += getBuildFixed().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIsShowStopper() != null) {
            _hashCode += getIsShowStopper().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getReviewer() != null) {
            _hashCode += getReviewer().hashCode();
        }
        if (getIsReviewed() != null) {
            _hashCode += getIsReviewed().hashCode();
        }
        if (getIssueStatus() != null) {
            _hashCode += getIssueStatus().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getIssueTagsList() != null) {
            _hashCode += getIssueTagsList().hashCode();
        }
        if (getIssueAbstract() != null) {
            _hashCode += getIssueAbstract().hashCode();
        }
        if (getNewDetails() != null) {
            _hashCode += getNewDetails().hashCode();
        }
        if (getIsOwner() != null) {
            _hashCode += getIsOwner().hashCode();
        }
        if (getTrackCode() != null) {
            _hashCode += getTrackCode().hashCode();
        }
        if (getEmailAssignee() != null) {
            _hashCode += getEmailAssignee().hashCode();
        }
        if (getEmailEmployeesList() != null) {
            _hashCode += getEmailEmployeesList().hashCode();
        }
        if (getEmailCellsList() != null) {
            _hashCode += getEmailCellsList().hashCode();
        }
        if (getExternalAbstract() != null) {
            _hashCode += getExternalAbstract().hashCode();
        }
        if (getExternalDetails() != null) {
            _hashCode += getExternalDetails().hashCode();
        }
        if (getBrokenInVersionList() != null) {
            _hashCode += getBrokenInVersionList().hashCode();
        }
        if (getTargetVersionList() != null) {
            _hashCode += getTargetVersionList().hashCode();
        }
        if (getFixedInVersionList() != null) {
            _hashCode += getFixedInVersionList().hashCode();
        }
        if (getRelatedIssuesList() != null) {
            _hashCode += getRelatedIssuesList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Issue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "Issue"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueTagsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issueTagsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "newDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "trackCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.support_2019_1.lists.webservices.netsuite.com", "IssueTrackCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAssignee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "emailAssignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEmployeesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "emailEmployeesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "EmailEmployeesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailCellsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "emailCellsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brokenInVersionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "brokenInVersionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetVersionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "targetVersionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedInVersionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "fixedInVersionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedIssuesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "relatedIssuesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueRelatedIssuesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
