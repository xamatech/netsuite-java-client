/**
 * IssueSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class IssueSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchLongField ageInMonths;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildBroken;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField buildBrokenName;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildFixed;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField buildFixedName;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildTarget;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField buildTargetName;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField caseCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField caseNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField closedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateReleased;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField details;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField duplicateOf;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField eFix;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employeeOrTeam;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField eventStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalAbstract;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalDetails;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalFixedIn;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField fixed;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fixedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOwner;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReviewed;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShowStopper;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField issueAbstract;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField issueNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField module;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField number;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField originalFixedIn;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priority;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField product;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField productTeam;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField relatedIssue;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField relationship;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField relationshipComment;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reportedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reproduce;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField resolved;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resolvedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reviewer;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField severity;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField source;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField tags;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField tracking;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField type;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField userType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionBroken;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionFixed;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionTarget;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public IssueSearchBasic() {
    }

    public IssueSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchLongField ageInMonths,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildBroken,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField buildBrokenName,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildFixed,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField buildFixedName,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildTarget,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField buildTargetName,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField caseCount,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField caseNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField closedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateReleased,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField details,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField duplicateOf,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField eFix,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employeeOrTeam,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField eventStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalAbstract,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalDetails,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalFixedIn,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField fixed,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fixedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOwner,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReviewed,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShowStopper,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField issueAbstract,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField issueNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField module,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField number,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField originalFixedIn,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priority,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField product,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField productTeam,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField relatedIssue,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField relationship,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField relationshipComment,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reportedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reproduce,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField resolved,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resolvedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reviewer,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField severity,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField source,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField tags,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField tracking,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField type,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField userType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionBroken,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionFixed,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionTarget,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.ageInMonths = ageInMonths;
        this.assigned = assigned;
        this.buildBroken = buildBroken;
        this.buildBrokenName = buildBrokenName;
        this.buildFixed = buildFixed;
        this.buildFixedName = buildFixedName;
        this.buildTarget = buildTarget;
        this.buildTargetName = buildTargetName;
        this.caseCount = caseCount;
        this.caseNumber = caseNumber;
        this.closedDate = closedDate;
        this.createdDate = createdDate;
        this.dateReleased = dateReleased;
        this.details = details;
        this.duplicateOf = duplicateOf;
        this.eFix = eFix;
        this.employeeOrTeam = employeeOrTeam;
        this.eventStatus = eventStatus;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.externalFixedIn = externalFixedIn;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.externalStatus = externalStatus;
        this.fixed = fixed;
        this.fixedBy = fixedBy;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isOwner = isOwner;
        this.isReviewed = isReviewed;
        this.isShowStopper = isShowStopper;
        this.issueAbstract = issueAbstract;
        this.issueNumber = issueNumber;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.module = module;
        this.number = number;
        this.originalFixedIn = originalFixedIn;
        this.priority = priority;
        this.product = product;
        this.productTeam = productTeam;
        this.relatedIssue = relatedIssue;
        this.relationship = relationship;
        this.relationshipComment = relationshipComment;
        this.reportedBy = reportedBy;
        this.reproduce = reproduce;
        this.resolved = resolved;
        this.resolvedBy = resolvedBy;
        this.reviewer = reviewer;
        this.severity = severity;
        this.source = source;
        this.status = status;
        this.tags = tags;
        this.tracking = tracking;
        this.type = type;
        this.userType = userType;
        this.versionBroken = versionBroken;
        this.versionFixed = versionFixed;
        this.versionTarget = versionTarget;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the ageInMonths value for this IssueSearchBasic.
     * 
     * @return ageInMonths
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getAgeInMonths() {
        return ageInMonths;
    }


    /**
     * Sets the ageInMonths value for this IssueSearchBasic.
     * 
     * @param ageInMonths
     */
    public void setAgeInMonths(com.netsuite.webservices.platform.core_2019_1.SearchLongField ageInMonths) {
        this.ageInMonths = ageInMonths;
    }


    /**
     * Gets the assigned value for this IssueSearchBasic.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this IssueSearchBasic.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the buildBroken value for this IssueSearchBasic.
     * 
     * @return buildBroken
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBuildBroken() {
        return buildBroken;
    }


    /**
     * Sets the buildBroken value for this IssueSearchBasic.
     * 
     * @param buildBroken
     */
    public void setBuildBroken(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildBroken) {
        this.buildBroken = buildBroken;
    }


    /**
     * Gets the buildBrokenName value for this IssueSearchBasic.
     * 
     * @return buildBrokenName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBuildBrokenName() {
        return buildBrokenName;
    }


    /**
     * Sets the buildBrokenName value for this IssueSearchBasic.
     * 
     * @param buildBrokenName
     */
    public void setBuildBrokenName(com.netsuite.webservices.platform.core_2019_1.SearchStringField buildBrokenName) {
        this.buildBrokenName = buildBrokenName;
    }


    /**
     * Gets the buildFixed value for this IssueSearchBasic.
     * 
     * @return buildFixed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBuildFixed() {
        return buildFixed;
    }


    /**
     * Sets the buildFixed value for this IssueSearchBasic.
     * 
     * @param buildFixed
     */
    public void setBuildFixed(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildFixed) {
        this.buildFixed = buildFixed;
    }


    /**
     * Gets the buildFixedName value for this IssueSearchBasic.
     * 
     * @return buildFixedName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBuildFixedName() {
        return buildFixedName;
    }


    /**
     * Sets the buildFixedName value for this IssueSearchBasic.
     * 
     * @param buildFixedName
     */
    public void setBuildFixedName(com.netsuite.webservices.platform.core_2019_1.SearchStringField buildFixedName) {
        this.buildFixedName = buildFixedName;
    }


    /**
     * Gets the buildTarget value for this IssueSearchBasic.
     * 
     * @return buildTarget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBuildTarget() {
        return buildTarget;
    }


    /**
     * Sets the buildTarget value for this IssueSearchBasic.
     * 
     * @param buildTarget
     */
    public void setBuildTarget(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buildTarget) {
        this.buildTarget = buildTarget;
    }


    /**
     * Gets the buildTargetName value for this IssueSearchBasic.
     * 
     * @return buildTargetName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBuildTargetName() {
        return buildTargetName;
    }


    /**
     * Sets the buildTargetName value for this IssueSearchBasic.
     * 
     * @param buildTargetName
     */
    public void setBuildTargetName(com.netsuite.webservices.platform.core_2019_1.SearchStringField buildTargetName) {
        this.buildTargetName = buildTargetName;
    }


    /**
     * Gets the caseCount value for this IssueSearchBasic.
     * 
     * @return caseCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getCaseCount() {
        return caseCount;
    }


    /**
     * Sets the caseCount value for this IssueSearchBasic.
     * 
     * @param caseCount
     */
    public void setCaseCount(com.netsuite.webservices.platform.core_2019_1.SearchLongField caseCount) {
        this.caseCount = caseCount;
    }


    /**
     * Gets the caseNumber value for this IssueSearchBasic.
     * 
     * @return caseNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this IssueSearchBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the closedDate value for this IssueSearchBasic.
     * 
     * @return closedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this IssueSearchBasic.
     * 
     * @param closedDate
     */
    public void setClosedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the createdDate value for this IssueSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this IssueSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dateReleased value for this IssueSearchBasic.
     * 
     * @return dateReleased
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateReleased() {
        return dateReleased;
    }


    /**
     * Sets the dateReleased value for this IssueSearchBasic.
     * 
     * @param dateReleased
     */
    public void setDateReleased(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateReleased) {
        this.dateReleased = dateReleased;
    }


    /**
     * Gets the details value for this IssueSearchBasic.
     * 
     * @return details
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDetails() {
        return details;
    }


    /**
     * Sets the details value for this IssueSearchBasic.
     * 
     * @param details
     */
    public void setDetails(com.netsuite.webservices.platform.core_2019_1.SearchStringField details) {
        this.details = details;
    }


    /**
     * Gets the duplicateOf value for this IssueSearchBasic.
     * 
     * @return duplicateOf
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDuplicateOf() {
        return duplicateOf;
    }


    /**
     * Sets the duplicateOf value for this IssueSearchBasic.
     * 
     * @param duplicateOf
     */
    public void setDuplicateOf(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField duplicateOf) {
        this.duplicateOf = duplicateOf;
    }


    /**
     * Gets the eFix value for this IssueSearchBasic.
     * 
     * @return eFix
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getEFix() {
        return eFix;
    }


    /**
     * Sets the eFix value for this IssueSearchBasic.
     * 
     * @param eFix
     */
    public void setEFix(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField eFix) {
        this.eFix = eFix;
    }


    /**
     * Gets the employeeOrTeam value for this IssueSearchBasic.
     * 
     * @return employeeOrTeam
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEmployeeOrTeam() {
        return employeeOrTeam;
    }


    /**
     * Sets the employeeOrTeam value for this IssueSearchBasic.
     * 
     * @param employeeOrTeam
     */
    public void setEmployeeOrTeam(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employeeOrTeam) {
        this.employeeOrTeam = employeeOrTeam;
    }


    /**
     * Gets the eventStatus value for this IssueSearchBasic.
     * 
     * @return eventStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getEventStatus() {
        return eventStatus;
    }


    /**
     * Sets the eventStatus value for this IssueSearchBasic.
     * 
     * @param eventStatus
     */
    public void setEventStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField eventStatus) {
        this.eventStatus = eventStatus;
    }


    /**
     * Gets the externalAbstract value for this IssueSearchBasic.
     * 
     * @return externalAbstract
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalAbstract() {
        return externalAbstract;
    }


    /**
     * Sets the externalAbstract value for this IssueSearchBasic.
     * 
     * @param externalAbstract
     */
    public void setExternalAbstract(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalAbstract) {
        this.externalAbstract = externalAbstract;
    }


    /**
     * Gets the externalDetails value for this IssueSearchBasic.
     * 
     * @return externalDetails
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalDetails() {
        return externalDetails;
    }


    /**
     * Sets the externalDetails value for this IssueSearchBasic.
     * 
     * @param externalDetails
     */
    public void setExternalDetails(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalDetails) {
        this.externalDetails = externalDetails;
    }


    /**
     * Gets the externalFixedIn value for this IssueSearchBasic.
     * 
     * @return externalFixedIn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalFixedIn() {
        return externalFixedIn;
    }


    /**
     * Sets the externalFixedIn value for this IssueSearchBasic.
     * 
     * @param externalFixedIn
     */
    public void setExternalFixedIn(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalFixedIn) {
        this.externalFixedIn = externalFixedIn;
    }


    /**
     * Gets the externalId value for this IssueSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this IssueSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this IssueSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this IssueSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the externalStatus value for this IssueSearchBasic.
     * 
     * @return externalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalStatus() {
        return externalStatus;
    }


    /**
     * Sets the externalStatus value for this IssueSearchBasic.
     * 
     * @param externalStatus
     */
    public void setExternalStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalStatus) {
        this.externalStatus = externalStatus;
    }


    /**
     * Gets the fixed value for this IssueSearchBasic.
     * 
     * @return fixed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getFixed() {
        return fixed;
    }


    /**
     * Sets the fixed value for this IssueSearchBasic.
     * 
     * @param fixed
     */
    public void setFixed(com.netsuite.webservices.platform.core_2019_1.SearchDateField fixed) {
        this.fixed = fixed;
    }


    /**
     * Gets the fixedBy value for this IssueSearchBasic.
     * 
     * @return fixedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getFixedBy() {
        return fixedBy;
    }


    /**
     * Sets the fixedBy value for this IssueSearchBasic.
     * 
     * @param fixedBy
     */
    public void setFixedBy(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fixedBy) {
        this.fixedBy = fixedBy;
    }


    /**
     * Gets the internalId value for this IssueSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this IssueSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this IssueSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this IssueSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isOwner value for this IssueSearchBasic.
     * 
     * @return isOwner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this IssueSearchBasic.
     * 
     * @param isOwner
     */
    public void setIsOwner(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOwner) {
        this.isOwner = isOwner;
    }


    /**
     * Gets the isReviewed value for this IssueSearchBasic.
     * 
     * @return isReviewed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsReviewed() {
        return isReviewed;
    }


    /**
     * Sets the isReviewed value for this IssueSearchBasic.
     * 
     * @param isReviewed
     */
    public void setIsReviewed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReviewed) {
        this.isReviewed = isReviewed;
    }


    /**
     * Gets the isShowStopper value for this IssueSearchBasic.
     * 
     * @return isShowStopper
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsShowStopper() {
        return isShowStopper;
    }


    /**
     * Sets the isShowStopper value for this IssueSearchBasic.
     * 
     * @param isShowStopper
     */
    public void setIsShowStopper(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShowStopper) {
        this.isShowStopper = isShowStopper;
    }


    /**
     * Gets the issueAbstract value for this IssueSearchBasic.
     * 
     * @return issueAbstract
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getIssueAbstract() {
        return issueAbstract;
    }


    /**
     * Sets the issueAbstract value for this IssueSearchBasic.
     * 
     * @param issueAbstract
     */
    public void setIssueAbstract(com.netsuite.webservices.platform.core_2019_1.SearchStringField issueAbstract) {
        this.issueAbstract = issueAbstract;
    }


    /**
     * Gets the issueNumber value for this IssueSearchBasic.
     * 
     * @return issueNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this IssueSearchBasic.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the item value for this IssueSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this IssueSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastModifiedDate value for this IssueSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this IssueSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the module value for this IssueSearchBasic.
     * 
     * @return module
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getModule() {
        return module;
    }


    /**
     * Sets the module value for this IssueSearchBasic.
     * 
     * @param module
     */
    public void setModule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField module) {
        this.module = module;
    }


    /**
     * Gets the number value for this IssueSearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this IssueSearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the originalFixedIn value for this IssueSearchBasic.
     * 
     * @return originalFixedIn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getOriginalFixedIn() {
        return originalFixedIn;
    }


    /**
     * Sets the originalFixedIn value for this IssueSearchBasic.
     * 
     * @param originalFixedIn
     */
    public void setOriginalFixedIn(com.netsuite.webservices.platform.core_2019_1.SearchStringField originalFixedIn) {
        this.originalFixedIn = originalFixedIn;
    }


    /**
     * Gets the priority value for this IssueSearchBasic.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this IssueSearchBasic.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priority) {
        this.priority = priority;
    }


    /**
     * Gets the product value for this IssueSearchBasic.
     * 
     * @return product
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getProduct() {
        return product;
    }


    /**
     * Sets the product value for this IssueSearchBasic.
     * 
     * @param product
     */
    public void setProduct(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField product) {
        this.product = product;
    }


    /**
     * Gets the productTeam value for this IssueSearchBasic.
     * 
     * @return productTeam
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getProductTeam() {
        return productTeam;
    }


    /**
     * Sets the productTeam value for this IssueSearchBasic.
     * 
     * @param productTeam
     */
    public void setProductTeam(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField productTeam) {
        this.productTeam = productTeam;
    }


    /**
     * Gets the relatedIssue value for this IssueSearchBasic.
     * 
     * @return relatedIssue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRelatedIssue() {
        return relatedIssue;
    }


    /**
     * Sets the relatedIssue value for this IssueSearchBasic.
     * 
     * @param relatedIssue
     */
    public void setRelatedIssue(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField relatedIssue) {
        this.relatedIssue = relatedIssue;
    }


    /**
     * Gets the relationship value for this IssueSearchBasic.
     * 
     * @return relationship
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this IssueSearchBasic.
     * 
     * @param relationship
     */
    public void setRelationship(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the relationshipComment value for this IssueSearchBasic.
     * 
     * @return relationshipComment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getRelationshipComment() {
        return relationshipComment;
    }


    /**
     * Sets the relationshipComment value for this IssueSearchBasic.
     * 
     * @param relationshipComment
     */
    public void setRelationshipComment(com.netsuite.webservices.platform.core_2019_1.SearchStringField relationshipComment) {
        this.relationshipComment = relationshipComment;
    }


    /**
     * Gets the reportedBy value for this IssueSearchBasic.
     * 
     * @return reportedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getReportedBy() {
        return reportedBy;
    }


    /**
     * Sets the reportedBy value for this IssueSearchBasic.
     * 
     * @param reportedBy
     */
    public void setReportedBy(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reportedBy) {
        this.reportedBy = reportedBy;
    }


    /**
     * Gets the reproduce value for this IssueSearchBasic.
     * 
     * @return reproduce
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getReproduce() {
        return reproduce;
    }


    /**
     * Sets the reproduce value for this IssueSearchBasic.
     * 
     * @param reproduce
     */
    public void setReproduce(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reproduce) {
        this.reproduce = reproduce;
    }


    /**
     * Gets the resolved value for this IssueSearchBasic.
     * 
     * @return resolved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getResolved() {
        return resolved;
    }


    /**
     * Sets the resolved value for this IssueSearchBasic.
     * 
     * @param resolved
     */
    public void setResolved(com.netsuite.webservices.platform.core_2019_1.SearchDateField resolved) {
        this.resolved = resolved;
    }


    /**
     * Gets the resolvedBy value for this IssueSearchBasic.
     * 
     * @return resolvedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getResolvedBy() {
        return resolvedBy;
    }


    /**
     * Sets the resolvedBy value for this IssueSearchBasic.
     * 
     * @param resolvedBy
     */
    public void setResolvedBy(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resolvedBy) {
        this.resolvedBy = resolvedBy;
    }


    /**
     * Gets the reviewer value for this IssueSearchBasic.
     * 
     * @return reviewer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getReviewer() {
        return reviewer;
    }


    /**
     * Sets the reviewer value for this IssueSearchBasic.
     * 
     * @param reviewer
     */
    public void setReviewer(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField reviewer) {
        this.reviewer = reviewer;
    }


    /**
     * Gets the severity value for this IssueSearchBasic.
     * 
     * @return severity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this IssueSearchBasic.
     * 
     * @param severity
     */
    public void setSeverity(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField severity) {
        this.severity = severity;
    }


    /**
     * Gets the source value for this IssueSearchBasic.
     * 
     * @return source
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSource() {
        return source;
    }


    /**
     * Sets the source value for this IssueSearchBasic.
     * 
     * @param source
     */
    public void setSource(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField source) {
        this.source = source;
    }


    /**
     * Gets the status value for this IssueSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this IssueSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the tags value for this IssueSearchBasic.
     * 
     * @return tags
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this IssueSearchBasic.
     * 
     * @param tags
     */
    public void setTags(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField tags) {
        this.tags = tags;
    }


    /**
     * Gets the tracking value for this IssueSearchBasic.
     * 
     * @return tracking
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getTracking() {
        return tracking;
    }


    /**
     * Sets the tracking value for this IssueSearchBasic.
     * 
     * @param tracking
     */
    public void setTracking(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField tracking) {
        this.tracking = tracking;
    }


    /**
     * Gets the type value for this IssueSearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this IssueSearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the userType value for this IssueSearchBasic.
     * 
     * @return userType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this IssueSearchBasic.
     * 
     * @param userType
     */
    public void setUserType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField userType) {
        this.userType = userType;
    }


    /**
     * Gets the versionBroken value for this IssueSearchBasic.
     * 
     * @return versionBroken
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVersionBroken() {
        return versionBroken;
    }


    /**
     * Sets the versionBroken value for this IssueSearchBasic.
     * 
     * @param versionBroken
     */
    public void setVersionBroken(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionBroken) {
        this.versionBroken = versionBroken;
    }


    /**
     * Gets the versionFixed value for this IssueSearchBasic.
     * 
     * @return versionFixed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVersionFixed() {
        return versionFixed;
    }


    /**
     * Sets the versionFixed value for this IssueSearchBasic.
     * 
     * @param versionFixed
     */
    public void setVersionFixed(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionFixed) {
        this.versionFixed = versionFixed;
    }


    /**
     * Gets the versionTarget value for this IssueSearchBasic.
     * 
     * @return versionTarget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVersionTarget() {
        return versionTarget;
    }


    /**
     * Sets the versionTarget value for this IssueSearchBasic.
     * 
     * @param versionTarget
     */
    public void setVersionTarget(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField versionTarget) {
        this.versionTarget = versionTarget;
    }


    /**
     * Gets the customFieldList value for this IssueSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this IssueSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueSearchBasic)) return false;
        IssueSearchBasic other = (IssueSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ageInMonths==null && other.getAgeInMonths()==null) || 
             (this.ageInMonths!=null &&
              this.ageInMonths.equals(other.getAgeInMonths()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.buildBroken==null && other.getBuildBroken()==null) || 
             (this.buildBroken!=null &&
              this.buildBroken.equals(other.getBuildBroken()))) &&
            ((this.buildBrokenName==null && other.getBuildBrokenName()==null) || 
             (this.buildBrokenName!=null &&
              this.buildBrokenName.equals(other.getBuildBrokenName()))) &&
            ((this.buildFixed==null && other.getBuildFixed()==null) || 
             (this.buildFixed!=null &&
              this.buildFixed.equals(other.getBuildFixed()))) &&
            ((this.buildFixedName==null && other.getBuildFixedName()==null) || 
             (this.buildFixedName!=null &&
              this.buildFixedName.equals(other.getBuildFixedName()))) &&
            ((this.buildTarget==null && other.getBuildTarget()==null) || 
             (this.buildTarget!=null &&
              this.buildTarget.equals(other.getBuildTarget()))) &&
            ((this.buildTargetName==null && other.getBuildTargetName()==null) || 
             (this.buildTargetName!=null &&
              this.buildTargetName.equals(other.getBuildTargetName()))) &&
            ((this.caseCount==null && other.getCaseCount()==null) || 
             (this.caseCount!=null &&
              this.caseCount.equals(other.getCaseCount()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dateReleased==null && other.getDateReleased()==null) || 
             (this.dateReleased!=null &&
              this.dateReleased.equals(other.getDateReleased()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.duplicateOf==null && other.getDuplicateOf()==null) || 
             (this.duplicateOf!=null &&
              this.duplicateOf.equals(other.getDuplicateOf()))) &&
            ((this.eFix==null && other.getEFix()==null) || 
             (this.eFix!=null &&
              this.eFix.equals(other.getEFix()))) &&
            ((this.employeeOrTeam==null && other.getEmployeeOrTeam()==null) || 
             (this.employeeOrTeam!=null &&
              this.employeeOrTeam.equals(other.getEmployeeOrTeam()))) &&
            ((this.eventStatus==null && other.getEventStatus()==null) || 
             (this.eventStatus!=null &&
              this.eventStatus.equals(other.getEventStatus()))) &&
            ((this.externalAbstract==null && other.getExternalAbstract()==null) || 
             (this.externalAbstract!=null &&
              this.externalAbstract.equals(other.getExternalAbstract()))) &&
            ((this.externalDetails==null && other.getExternalDetails()==null) || 
             (this.externalDetails!=null &&
              this.externalDetails.equals(other.getExternalDetails()))) &&
            ((this.externalFixedIn==null && other.getExternalFixedIn()==null) || 
             (this.externalFixedIn!=null &&
              this.externalFixedIn.equals(other.getExternalFixedIn()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.externalStatus==null && other.getExternalStatus()==null) || 
             (this.externalStatus!=null &&
              this.externalStatus.equals(other.getExternalStatus()))) &&
            ((this.fixed==null && other.getFixed()==null) || 
             (this.fixed!=null &&
              this.fixed.equals(other.getFixed()))) &&
            ((this.fixedBy==null && other.getFixedBy()==null) || 
             (this.fixedBy!=null &&
              this.fixedBy.equals(other.getFixedBy()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isOwner==null && other.getIsOwner()==null) || 
             (this.isOwner!=null &&
              this.isOwner.equals(other.getIsOwner()))) &&
            ((this.isReviewed==null && other.getIsReviewed()==null) || 
             (this.isReviewed!=null &&
              this.isReviewed.equals(other.getIsReviewed()))) &&
            ((this.isShowStopper==null && other.getIsShowStopper()==null) || 
             (this.isShowStopper!=null &&
              this.isShowStopper.equals(other.getIsShowStopper()))) &&
            ((this.issueAbstract==null && other.getIssueAbstract()==null) || 
             (this.issueAbstract!=null &&
              this.issueAbstract.equals(other.getIssueAbstract()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.originalFixedIn==null && other.getOriginalFixedIn()==null) || 
             (this.originalFixedIn!=null &&
              this.originalFixedIn.equals(other.getOriginalFixedIn()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.productTeam==null && other.getProductTeam()==null) || 
             (this.productTeam!=null &&
              this.productTeam.equals(other.getProductTeam()))) &&
            ((this.relatedIssue==null && other.getRelatedIssue()==null) || 
             (this.relatedIssue!=null &&
              this.relatedIssue.equals(other.getRelatedIssue()))) &&
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              this.relationship.equals(other.getRelationship()))) &&
            ((this.relationshipComment==null && other.getRelationshipComment()==null) || 
             (this.relationshipComment!=null &&
              this.relationshipComment.equals(other.getRelationshipComment()))) &&
            ((this.reportedBy==null && other.getReportedBy()==null) || 
             (this.reportedBy!=null &&
              this.reportedBy.equals(other.getReportedBy()))) &&
            ((this.reproduce==null && other.getReproduce()==null) || 
             (this.reproduce!=null &&
              this.reproduce.equals(other.getReproduce()))) &&
            ((this.resolved==null && other.getResolved()==null) || 
             (this.resolved!=null &&
              this.resolved.equals(other.getResolved()))) &&
            ((this.resolvedBy==null && other.getResolvedBy()==null) || 
             (this.resolvedBy!=null &&
              this.resolvedBy.equals(other.getResolvedBy()))) &&
            ((this.reviewer==null && other.getReviewer()==null) || 
             (this.reviewer!=null &&
              this.reviewer.equals(other.getReviewer()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.tracking==null && other.getTracking()==null) || 
             (this.tracking!=null &&
              this.tracking.equals(other.getTracking()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.versionBroken==null && other.getVersionBroken()==null) || 
             (this.versionBroken!=null &&
              this.versionBroken.equals(other.getVersionBroken()))) &&
            ((this.versionFixed==null && other.getVersionFixed()==null) || 
             (this.versionFixed!=null &&
              this.versionFixed.equals(other.getVersionFixed()))) &&
            ((this.versionTarget==null && other.getVersionTarget()==null) || 
             (this.versionTarget!=null &&
              this.versionTarget.equals(other.getVersionTarget()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getAgeInMonths() != null) {
            _hashCode += getAgeInMonths().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getBuildBroken() != null) {
            _hashCode += getBuildBroken().hashCode();
        }
        if (getBuildBrokenName() != null) {
            _hashCode += getBuildBrokenName().hashCode();
        }
        if (getBuildFixed() != null) {
            _hashCode += getBuildFixed().hashCode();
        }
        if (getBuildFixedName() != null) {
            _hashCode += getBuildFixedName().hashCode();
        }
        if (getBuildTarget() != null) {
            _hashCode += getBuildTarget().hashCode();
        }
        if (getBuildTargetName() != null) {
            _hashCode += getBuildTargetName().hashCode();
        }
        if (getCaseCount() != null) {
            _hashCode += getCaseCount().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDateReleased() != null) {
            _hashCode += getDateReleased().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getDuplicateOf() != null) {
            _hashCode += getDuplicateOf().hashCode();
        }
        if (getEFix() != null) {
            _hashCode += getEFix().hashCode();
        }
        if (getEmployeeOrTeam() != null) {
            _hashCode += getEmployeeOrTeam().hashCode();
        }
        if (getEventStatus() != null) {
            _hashCode += getEventStatus().hashCode();
        }
        if (getExternalAbstract() != null) {
            _hashCode += getExternalAbstract().hashCode();
        }
        if (getExternalDetails() != null) {
            _hashCode += getExternalDetails().hashCode();
        }
        if (getExternalFixedIn() != null) {
            _hashCode += getExternalFixedIn().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getExternalStatus() != null) {
            _hashCode += getExternalStatus().hashCode();
        }
        if (getFixed() != null) {
            _hashCode += getFixed().hashCode();
        }
        if (getFixedBy() != null) {
            _hashCode += getFixedBy().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsOwner() != null) {
            _hashCode += getIsOwner().hashCode();
        }
        if (getIsReviewed() != null) {
            _hashCode += getIsReviewed().hashCode();
        }
        if (getIsShowStopper() != null) {
            _hashCode += getIsShowStopper().hashCode();
        }
        if (getIssueAbstract() != null) {
            _hashCode += getIssueAbstract().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOriginalFixedIn() != null) {
            _hashCode += getOriginalFixedIn().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProductTeam() != null) {
            _hashCode += getProductTeam().hashCode();
        }
        if (getRelatedIssue() != null) {
            _hashCode += getRelatedIssue().hashCode();
        }
        if (getRelationship() != null) {
            _hashCode += getRelationship().hashCode();
        }
        if (getRelationshipComment() != null) {
            _hashCode += getRelationshipComment().hashCode();
        }
        if (getReportedBy() != null) {
            _hashCode += getReportedBy().hashCode();
        }
        if (getReproduce() != null) {
            _hashCode += getReproduce().hashCode();
        }
        if (getResolved() != null) {
            _hashCode += getResolved().hashCode();
        }
        if (getResolvedBy() != null) {
            _hashCode += getResolvedBy().hashCode();
        }
        if (getReviewer() != null) {
            _hashCode += getReviewer().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getTracking() != null) {
            _hashCode += getTracking().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getVersionBroken() != null) {
            _hashCode += getVersionBroken().hashCode();
        }
        if (getVersionFixed() != null) {
            _hashCode += getVersionFixed().hashCode();
        }
        if (getVersionTarget() != null) {
            _hashCode += getVersionTarget().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "IssueSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ageInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildBrokenName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildBrokenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildFixedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildFixedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTargetName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildTargetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateReleased");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateReleased"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "duplicateOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EFix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eFix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeOrTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employeeOrTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eventStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalFixedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("externalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fixedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "originalFixedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "relatedIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "relationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "relationshipComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resolvedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
