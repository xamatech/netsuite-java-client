/**
 * IssueSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class IssueSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] ageInMonths;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assigned;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildBroken;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildFixed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildTarget;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] caseCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateReleased;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] duplicateOf;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employeeOrTeam;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] eventStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalAbstract;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalDetails;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalFixedIn;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] fixed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fixedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOwner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isReviewed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isShowStopper;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] issueAbstract;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issueStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] module;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] number;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] originalFixedIn;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priority;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] product;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] productTeam;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] relatedIssue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] relationship;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] relationshipComment;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reportedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reproduce;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] resolved;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resolvedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reviewer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] severity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] source;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] tags;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] type;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] userType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionBroken;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionFixed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionTarget;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public IssueSearchRowBasic() {
    }

    public IssueSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] ageInMonths,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assigned,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildBroken,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildFixed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildTarget,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] caseCount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateReleased,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] duplicateOf,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employeeOrTeam,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] eventStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalAbstract,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalDetails,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalFixedIn,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] fixed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fixedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOwner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isReviewed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isShowStopper,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] issueAbstract,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issueStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] module,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] number,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] originalFixedIn,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priority,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] product,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] productTeam,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] relatedIssue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] relationship,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] relationshipComment,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reportedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reproduce,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] resolved,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resolvedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reviewer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] severity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] source,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] tags,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] type,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] userType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionBroken,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionFixed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionTarget,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.ageInMonths = ageInMonths;
        this.assigned = assigned;
        this.buildBroken = buildBroken;
        this.buildFixed = buildFixed;
        this.buildTarget = buildTarget;
        this.caseCount = caseCount;
        this.caseNumber = caseNumber;
        this.closedDate = closedDate;
        this.createdDate = createdDate;
        this.dateReleased = dateReleased;
        this.duplicateOf = duplicateOf;
        this.employeeOrTeam = employeeOrTeam;
        this.eventStatus = eventStatus;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.externalFixedIn = externalFixedIn;
        this.externalId = externalId;
        this.externalStatus = externalStatus;
        this.fixed = fixed;
        this.fixedBy = fixedBy;
        this.internalId = internalId;
        this.isOwner = isOwner;
        this.isReviewed = isReviewed;
        this.isShowStopper = isShowStopper;
        this.issueAbstract = issueAbstract;
        this.issueStatus = issueStatus;
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
        this.tags = tags;
        this.type = type;
        this.userType = userType;
        this.versionBroken = versionBroken;
        this.versionFixed = versionFixed;
        this.versionTarget = versionTarget;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the ageInMonths value for this IssueSearchRowBasic.
     * 
     * @return ageInMonths
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getAgeInMonths() {
        return ageInMonths;
    }


    /**
     * Sets the ageInMonths value for this IssueSearchRowBasic.
     * 
     * @param ageInMonths
     */
    public void setAgeInMonths(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getAgeInMonths(int i) {
        return this.ageInMonths[i];
    }

    public void setAgeInMonths(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.ageInMonths[i] = _value;
    }


    /**
     * Gets the assigned value for this IssueSearchRowBasic.
     * 
     * @return assigned
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this IssueSearchRowBasic.
     * 
     * @param assigned
     */
    public void setAssigned(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assigned) {
        this.assigned = assigned;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.assigned[i] = _value;
    }


    /**
     * Gets the buildBroken value for this IssueSearchRowBasic.
     * 
     * @return buildBroken
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBuildBroken() {
        return buildBroken;
    }


    /**
     * Sets the buildBroken value for this IssueSearchRowBasic.
     * 
     * @param buildBroken
     */
    public void setBuildBroken(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildBroken) {
        this.buildBroken = buildBroken;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBuildBroken(int i) {
        return this.buildBroken[i];
    }

    public void setBuildBroken(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.buildBroken[i] = _value;
    }


    /**
     * Gets the buildFixed value for this IssueSearchRowBasic.
     * 
     * @return buildFixed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBuildFixed() {
        return buildFixed;
    }


    /**
     * Sets the buildFixed value for this IssueSearchRowBasic.
     * 
     * @param buildFixed
     */
    public void setBuildFixed(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildFixed) {
        this.buildFixed = buildFixed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBuildFixed(int i) {
        return this.buildFixed[i];
    }

    public void setBuildFixed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.buildFixed[i] = _value;
    }


    /**
     * Gets the buildTarget value for this IssueSearchRowBasic.
     * 
     * @return buildTarget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBuildTarget() {
        return buildTarget;
    }


    /**
     * Sets the buildTarget value for this IssueSearchRowBasic.
     * 
     * @param buildTarget
     */
    public void setBuildTarget(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] buildTarget) {
        this.buildTarget = buildTarget;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBuildTarget(int i) {
        return this.buildTarget[i];
    }

    public void setBuildTarget(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.buildTarget[i] = _value;
    }


    /**
     * Gets the caseCount value for this IssueSearchRowBasic.
     * 
     * @return caseCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getCaseCount() {
        return caseCount;
    }


    /**
     * Sets the caseCount value for this IssueSearchRowBasic.
     * 
     * @param caseCount
     */
    public void setCaseCount(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] caseCount) {
        this.caseCount = caseCount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getCaseCount(int i) {
        return this.caseCount[i];
    }

    public void setCaseCount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.caseCount[i] = _value;
    }


    /**
     * Gets the caseNumber value for this IssueSearchRowBasic.
     * 
     * @return caseNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this IssueSearchRowBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] caseNumber) {
        this.caseNumber = caseNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCaseNumber(int i) {
        return this.caseNumber[i];
    }

    public void setCaseNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.caseNumber[i] = _value;
    }


    /**
     * Gets the closedDate value for this IssueSearchRowBasic.
     * 
     * @return closedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this IssueSearchRowBasic.
     * 
     * @param closedDate
     */
    public void setClosedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closedDate) {
        this.closedDate = closedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getClosedDate(int i) {
        return this.closedDate[i];
    }

    public void setClosedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.closedDate[i] = _value;
    }


    /**
     * Gets the createdDate value for this IssueSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this IssueSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the dateReleased value for this IssueSearchRowBasic.
     * 
     * @return dateReleased
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateReleased() {
        return dateReleased;
    }


    /**
     * Sets the dateReleased value for this IssueSearchRowBasic.
     * 
     * @param dateReleased
     */
    public void setDateReleased(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateReleased) {
        this.dateReleased = dateReleased;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateReleased(int i) {
        return this.dateReleased[i];
    }

    public void setDateReleased(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateReleased[i] = _value;
    }


    /**
     * Gets the duplicateOf value for this IssueSearchRowBasic.
     * 
     * @return duplicateOf
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDuplicateOf() {
        return duplicateOf;
    }


    /**
     * Sets the duplicateOf value for this IssueSearchRowBasic.
     * 
     * @param duplicateOf
     */
    public void setDuplicateOf(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] duplicateOf) {
        this.duplicateOf = duplicateOf;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDuplicateOf(int i) {
        return this.duplicateOf[i];
    }

    public void setDuplicateOf(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.duplicateOf[i] = _value;
    }


    /**
     * Gets the employeeOrTeam value for this IssueSearchRowBasic.
     * 
     * @return employeeOrTeam
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEmployeeOrTeam() {
        return employeeOrTeam;
    }


    /**
     * Sets the employeeOrTeam value for this IssueSearchRowBasic.
     * 
     * @param employeeOrTeam
     */
    public void setEmployeeOrTeam(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employeeOrTeam) {
        this.employeeOrTeam = employeeOrTeam;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEmployeeOrTeam(int i) {
        return this.employeeOrTeam[i];
    }

    public void setEmployeeOrTeam(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.employeeOrTeam[i] = _value;
    }


    /**
     * Gets the eventStatus value for this IssueSearchRowBasic.
     * 
     * @return eventStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getEventStatus() {
        return eventStatus;
    }


    /**
     * Sets the eventStatus value for this IssueSearchRowBasic.
     * 
     * @param eventStatus
     */
    public void setEventStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] eventStatus) {
        this.eventStatus = eventStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getEventStatus(int i) {
        return this.eventStatus[i];
    }

    public void setEventStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.eventStatus[i] = _value;
    }


    /**
     * Gets the externalAbstract value for this IssueSearchRowBasic.
     * 
     * @return externalAbstract
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getExternalAbstract() {
        return externalAbstract;
    }


    /**
     * Sets the externalAbstract value for this IssueSearchRowBasic.
     * 
     * @param externalAbstract
     */
    public void setExternalAbstract(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalAbstract) {
        this.externalAbstract = externalAbstract;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getExternalAbstract(int i) {
        return this.externalAbstract[i];
    }

    public void setExternalAbstract(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.externalAbstract[i] = _value;
    }


    /**
     * Gets the externalDetails value for this IssueSearchRowBasic.
     * 
     * @return externalDetails
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getExternalDetails() {
        return externalDetails;
    }


    /**
     * Sets the externalDetails value for this IssueSearchRowBasic.
     * 
     * @param externalDetails
     */
    public void setExternalDetails(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalDetails) {
        this.externalDetails = externalDetails;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getExternalDetails(int i) {
        return this.externalDetails[i];
    }

    public void setExternalDetails(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.externalDetails[i] = _value;
    }


    /**
     * Gets the externalFixedIn value for this IssueSearchRowBasic.
     * 
     * @return externalFixedIn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getExternalFixedIn() {
        return externalFixedIn;
    }


    /**
     * Sets the externalFixedIn value for this IssueSearchRowBasic.
     * 
     * @param externalFixedIn
     */
    public void setExternalFixedIn(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] externalFixedIn) {
        this.externalFixedIn = externalFixedIn;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getExternalFixedIn(int i) {
        return this.externalFixedIn[i];
    }

    public void setExternalFixedIn(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.externalFixedIn[i] = _value;
    }


    /**
     * Gets the externalId value for this IssueSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this IssueSearchRowBasic.
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
     * Gets the externalStatus value for this IssueSearchRowBasic.
     * 
     * @return externalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalStatus() {
        return externalStatus;
    }


    /**
     * Sets the externalStatus value for this IssueSearchRowBasic.
     * 
     * @param externalStatus
     */
    public void setExternalStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalStatus) {
        this.externalStatus = externalStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalStatus(int i) {
        return this.externalStatus[i];
    }

    public void setExternalStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalStatus[i] = _value;
    }


    /**
     * Gets the fixed value for this IssueSearchRowBasic.
     * 
     * @return fixed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getFixed() {
        return fixed;
    }


    /**
     * Sets the fixed value for this IssueSearchRowBasic.
     * 
     * @param fixed
     */
    public void setFixed(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] fixed) {
        this.fixed = fixed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getFixed(int i) {
        return this.fixed[i];
    }

    public void setFixed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.fixed[i] = _value;
    }


    /**
     * Gets the fixedBy value for this IssueSearchRowBasic.
     * 
     * @return fixedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getFixedBy() {
        return fixedBy;
    }


    /**
     * Sets the fixedBy value for this IssueSearchRowBasic.
     * 
     * @param fixedBy
     */
    public void setFixedBy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fixedBy) {
        this.fixedBy = fixedBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getFixedBy(int i) {
        return this.fixedBy[i];
    }

    public void setFixedBy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.fixedBy[i] = _value;
    }


    /**
     * Gets the internalId value for this IssueSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this IssueSearchRowBasic.
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
     * Gets the isOwner value for this IssueSearchRowBasic.
     * 
     * @return isOwner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this IssueSearchRowBasic.
     * 
     * @param isOwner
     */
    public void setIsOwner(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOwner) {
        this.isOwner = isOwner;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsOwner(int i) {
        return this.isOwner[i];
    }

    public void setIsOwner(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isOwner[i] = _value;
    }


    /**
     * Gets the isReviewed value for this IssueSearchRowBasic.
     * 
     * @return isReviewed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsReviewed() {
        return isReviewed;
    }


    /**
     * Sets the isReviewed value for this IssueSearchRowBasic.
     * 
     * @param isReviewed
     */
    public void setIsReviewed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isReviewed) {
        this.isReviewed = isReviewed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsReviewed(int i) {
        return this.isReviewed[i];
    }

    public void setIsReviewed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isReviewed[i] = _value;
    }


    /**
     * Gets the isShowStopper value for this IssueSearchRowBasic.
     * 
     * @return isShowStopper
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsShowStopper() {
        return isShowStopper;
    }


    /**
     * Sets the isShowStopper value for this IssueSearchRowBasic.
     * 
     * @param isShowStopper
     */
    public void setIsShowStopper(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isShowStopper) {
        this.isShowStopper = isShowStopper;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsShowStopper(int i) {
        return this.isShowStopper[i];
    }

    public void setIsShowStopper(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isShowStopper[i] = _value;
    }


    /**
     * Gets the issueAbstract value for this IssueSearchRowBasic.
     * 
     * @return issueAbstract
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getIssueAbstract() {
        return issueAbstract;
    }


    /**
     * Sets the issueAbstract value for this IssueSearchRowBasic.
     * 
     * @param issueAbstract
     */
    public void setIssueAbstract(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] issueAbstract) {
        this.issueAbstract = issueAbstract;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getIssueAbstract(int i) {
        return this.issueAbstract[i];
    }

    public void setIssueAbstract(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.issueAbstract[i] = _value;
    }


    /**
     * Gets the issueStatus value for this IssueSearchRowBasic.
     * 
     * @return issueStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIssueStatus() {
        return issueStatus;
    }


    /**
     * Sets the issueStatus value for this IssueSearchRowBasic.
     * 
     * @param issueStatus
     */
    public void setIssueStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] issueStatus) {
        this.issueStatus = issueStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIssueStatus(int i) {
        return this.issueStatus[i];
    }

    public void setIssueStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.issueStatus[i] = _value;
    }


    /**
     * Gets the item value for this IssueSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this IssueSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this IssueSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this IssueSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the module value for this IssueSearchRowBasic.
     * 
     * @return module
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getModule() {
        return module;
    }


    /**
     * Sets the module value for this IssueSearchRowBasic.
     * 
     * @param module
     */
    public void setModule(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] module) {
        this.module = module;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getModule(int i) {
        return this.module[i];
    }

    public void setModule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.module[i] = _value;
    }


    /**
     * Gets the number value for this IssueSearchRowBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNumber() {
        return number;
    }


    /**
     * Sets the number value for this IssueSearchRowBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] number) {
        this.number = number;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNumber(int i) {
        return this.number[i];
    }

    public void setNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.number[i] = _value;
    }


    /**
     * Gets the originalFixedIn value for this IssueSearchRowBasic.
     * 
     * @return originalFixedIn
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getOriginalFixedIn() {
        return originalFixedIn;
    }


    /**
     * Sets the originalFixedIn value for this IssueSearchRowBasic.
     * 
     * @param originalFixedIn
     */
    public void setOriginalFixedIn(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] originalFixedIn) {
        this.originalFixedIn = originalFixedIn;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getOriginalFixedIn(int i) {
        return this.originalFixedIn[i];
    }

    public void setOriginalFixedIn(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.originalFixedIn[i] = _value;
    }


    /**
     * Gets the priority value for this IssueSearchRowBasic.
     * 
     * @return priority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this IssueSearchRowBasic.
     * 
     * @param priority
     */
    public void setPriority(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priority) {
        this.priority = priority;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.priority[i] = _value;
    }


    /**
     * Gets the product value for this IssueSearchRowBasic.
     * 
     * @return product
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this IssueSearchRowBasic.
     * 
     * @param product
     */
    public void setProduct(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] product) {
        this.product = product;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the productTeam value for this IssueSearchRowBasic.
     * 
     * @return productTeam
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProductTeam() {
        return productTeam;
    }


    /**
     * Sets the productTeam value for this IssueSearchRowBasic.
     * 
     * @param productTeam
     */
    public void setProductTeam(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] productTeam) {
        this.productTeam = productTeam;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProductTeam(int i) {
        return this.productTeam[i];
    }

    public void setProductTeam(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.productTeam[i] = _value;
    }


    /**
     * Gets the relatedIssue value for this IssueSearchRowBasic.
     * 
     * @return relatedIssue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRelatedIssue() {
        return relatedIssue;
    }


    /**
     * Sets the relatedIssue value for this IssueSearchRowBasic.
     * 
     * @param relatedIssue
     */
    public void setRelatedIssue(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] relatedIssue) {
        this.relatedIssue = relatedIssue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRelatedIssue(int i) {
        return this.relatedIssue[i];
    }

    public void setRelatedIssue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.relatedIssue[i] = _value;
    }


    /**
     * Gets the relationship value for this IssueSearchRowBasic.
     * 
     * @return relationship
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this IssueSearchRowBasic.
     * 
     * @param relationship
     */
    public void setRelationship(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] relationship) {
        this.relationship = relationship;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getRelationship(int i) {
        return this.relationship[i];
    }

    public void setRelationship(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.relationship[i] = _value;
    }


    /**
     * Gets the relationshipComment value for this IssueSearchRowBasic.
     * 
     * @return relationshipComment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRelationshipComment() {
        return relationshipComment;
    }


    /**
     * Sets the relationshipComment value for this IssueSearchRowBasic.
     * 
     * @param relationshipComment
     */
    public void setRelationshipComment(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] relationshipComment) {
        this.relationshipComment = relationshipComment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRelationshipComment(int i) {
        return this.relationshipComment[i];
    }

    public void setRelationshipComment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.relationshipComment[i] = _value;
    }


    /**
     * Gets the reportedBy value for this IssueSearchRowBasic.
     * 
     * @return reportedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getReportedBy() {
        return reportedBy;
    }


    /**
     * Sets the reportedBy value for this IssueSearchRowBasic.
     * 
     * @param reportedBy
     */
    public void setReportedBy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reportedBy) {
        this.reportedBy = reportedBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getReportedBy(int i) {
        return this.reportedBy[i];
    }

    public void setReportedBy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.reportedBy[i] = _value;
    }


    /**
     * Gets the reproduce value for this IssueSearchRowBasic.
     * 
     * @return reproduce
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getReproduce() {
        return reproduce;
    }


    /**
     * Sets the reproduce value for this IssueSearchRowBasic.
     * 
     * @param reproduce
     */
    public void setReproduce(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reproduce) {
        this.reproduce = reproduce;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getReproduce(int i) {
        return this.reproduce[i];
    }

    public void setReproduce(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.reproduce[i] = _value;
    }


    /**
     * Gets the resolved value for this IssueSearchRowBasic.
     * 
     * @return resolved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getResolved() {
        return resolved;
    }


    /**
     * Sets the resolved value for this IssueSearchRowBasic.
     * 
     * @param resolved
     */
    public void setResolved(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] resolved) {
        this.resolved = resolved;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getResolved(int i) {
        return this.resolved[i];
    }

    public void setResolved(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.resolved[i] = _value;
    }


    /**
     * Gets the resolvedBy value for this IssueSearchRowBasic.
     * 
     * @return resolvedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getResolvedBy() {
        return resolvedBy;
    }


    /**
     * Sets the resolvedBy value for this IssueSearchRowBasic.
     * 
     * @param resolvedBy
     */
    public void setResolvedBy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getResolvedBy(int i) {
        return this.resolvedBy[i];
    }

    public void setResolvedBy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.resolvedBy[i] = _value;
    }


    /**
     * Gets the reviewer value for this IssueSearchRowBasic.
     * 
     * @return reviewer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getReviewer() {
        return reviewer;
    }


    /**
     * Sets the reviewer value for this IssueSearchRowBasic.
     * 
     * @param reviewer
     */
    public void setReviewer(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] reviewer) {
        this.reviewer = reviewer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getReviewer(int i) {
        return this.reviewer[i];
    }

    public void setReviewer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.reviewer[i] = _value;
    }


    /**
     * Gets the severity value for this IssueSearchRowBasic.
     * 
     * @return severity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this IssueSearchRowBasic.
     * 
     * @param severity
     */
    public void setSeverity(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] severity) {
        this.severity = severity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSeverity(int i) {
        return this.severity[i];
    }

    public void setSeverity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.severity[i] = _value;
    }


    /**
     * Gets the source value for this IssueSearchRowBasic.
     * 
     * @return source
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this IssueSearchRowBasic.
     * 
     * @param source
     */
    public void setSource(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] source) {
        this.source = source;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the tags value for this IssueSearchRowBasic.
     * 
     * @return tags
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this IssueSearchRowBasic.
     * 
     * @param tags
     */
    public void setTags(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] tags) {
        this.tags = tags;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTags(int i) {
        return this.tags[i];
    }

    public void setTags(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.tags[i] = _value;
    }


    /**
     * Gets the type value for this IssueSearchRowBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this IssueSearchRowBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] type) {
        this.type = type;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the userType value for this IssueSearchRowBasic.
     * 
     * @return userType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this IssueSearchRowBasic.
     * 
     * @param userType
     */
    public void setUserType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] userType) {
        this.userType = userType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getUserType(int i) {
        return this.userType[i];
    }

    public void setUserType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.userType[i] = _value;
    }


    /**
     * Gets the versionBroken value for this IssueSearchRowBasic.
     * 
     * @return versionBroken
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVersionBroken() {
        return versionBroken;
    }


    /**
     * Sets the versionBroken value for this IssueSearchRowBasic.
     * 
     * @param versionBroken
     */
    public void setVersionBroken(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionBroken) {
        this.versionBroken = versionBroken;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVersionBroken(int i) {
        return this.versionBroken[i];
    }

    public void setVersionBroken(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.versionBroken[i] = _value;
    }


    /**
     * Gets the versionFixed value for this IssueSearchRowBasic.
     * 
     * @return versionFixed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVersionFixed() {
        return versionFixed;
    }


    /**
     * Sets the versionFixed value for this IssueSearchRowBasic.
     * 
     * @param versionFixed
     */
    public void setVersionFixed(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionFixed) {
        this.versionFixed = versionFixed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVersionFixed(int i) {
        return this.versionFixed[i];
    }

    public void setVersionFixed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.versionFixed[i] = _value;
    }


    /**
     * Gets the versionTarget value for this IssueSearchRowBasic.
     * 
     * @return versionTarget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVersionTarget() {
        return versionTarget;
    }


    /**
     * Sets the versionTarget value for this IssueSearchRowBasic.
     * 
     * @param versionTarget
     */
    public void setVersionTarget(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] versionTarget) {
        this.versionTarget = versionTarget;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVersionTarget(int i) {
        return this.versionTarget[i];
    }

    public void setVersionTarget(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.versionTarget[i] = _value;
    }


    /**
     * Gets the customFieldList value for this IssueSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this IssueSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueSearchRowBasic)) return false;
        IssueSearchRowBasic other = (IssueSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.ageInMonths, other.getAgeInMonths()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              java.util.Arrays.equals(this.assigned, other.getAssigned()))) &&
            ((this.buildBroken==null && other.getBuildBroken()==null) || 
             (this.buildBroken!=null &&
              java.util.Arrays.equals(this.buildBroken, other.getBuildBroken()))) &&
            ((this.buildFixed==null && other.getBuildFixed()==null) || 
             (this.buildFixed!=null &&
              java.util.Arrays.equals(this.buildFixed, other.getBuildFixed()))) &&
            ((this.buildTarget==null && other.getBuildTarget()==null) || 
             (this.buildTarget!=null &&
              java.util.Arrays.equals(this.buildTarget, other.getBuildTarget()))) &&
            ((this.caseCount==null && other.getCaseCount()==null) || 
             (this.caseCount!=null &&
              java.util.Arrays.equals(this.caseCount, other.getCaseCount()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              java.util.Arrays.equals(this.caseNumber, other.getCaseNumber()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              java.util.Arrays.equals(this.closedDate, other.getClosedDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.dateReleased==null && other.getDateReleased()==null) || 
             (this.dateReleased!=null &&
              java.util.Arrays.equals(this.dateReleased, other.getDateReleased()))) &&
            ((this.duplicateOf==null && other.getDuplicateOf()==null) || 
             (this.duplicateOf!=null &&
              java.util.Arrays.equals(this.duplicateOf, other.getDuplicateOf()))) &&
            ((this.employeeOrTeam==null && other.getEmployeeOrTeam()==null) || 
             (this.employeeOrTeam!=null &&
              java.util.Arrays.equals(this.employeeOrTeam, other.getEmployeeOrTeam()))) &&
            ((this.eventStatus==null && other.getEventStatus()==null) || 
             (this.eventStatus!=null &&
              java.util.Arrays.equals(this.eventStatus, other.getEventStatus()))) &&
            ((this.externalAbstract==null && other.getExternalAbstract()==null) || 
             (this.externalAbstract!=null &&
              java.util.Arrays.equals(this.externalAbstract, other.getExternalAbstract()))) &&
            ((this.externalDetails==null && other.getExternalDetails()==null) || 
             (this.externalDetails!=null &&
              java.util.Arrays.equals(this.externalDetails, other.getExternalDetails()))) &&
            ((this.externalFixedIn==null && other.getExternalFixedIn()==null) || 
             (this.externalFixedIn!=null &&
              java.util.Arrays.equals(this.externalFixedIn, other.getExternalFixedIn()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalStatus==null && other.getExternalStatus()==null) || 
             (this.externalStatus!=null &&
              java.util.Arrays.equals(this.externalStatus, other.getExternalStatus()))) &&
            ((this.fixed==null && other.getFixed()==null) || 
             (this.fixed!=null &&
              java.util.Arrays.equals(this.fixed, other.getFixed()))) &&
            ((this.fixedBy==null && other.getFixedBy()==null) || 
             (this.fixedBy!=null &&
              java.util.Arrays.equals(this.fixedBy, other.getFixedBy()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isOwner==null && other.getIsOwner()==null) || 
             (this.isOwner!=null &&
              java.util.Arrays.equals(this.isOwner, other.getIsOwner()))) &&
            ((this.isReviewed==null && other.getIsReviewed()==null) || 
             (this.isReviewed!=null &&
              java.util.Arrays.equals(this.isReviewed, other.getIsReviewed()))) &&
            ((this.isShowStopper==null && other.getIsShowStopper()==null) || 
             (this.isShowStopper!=null &&
              java.util.Arrays.equals(this.isShowStopper, other.getIsShowStopper()))) &&
            ((this.issueAbstract==null && other.getIssueAbstract()==null) || 
             (this.issueAbstract!=null &&
              java.util.Arrays.equals(this.issueAbstract, other.getIssueAbstract()))) &&
            ((this.issueStatus==null && other.getIssueStatus()==null) || 
             (this.issueStatus!=null &&
              java.util.Arrays.equals(this.issueStatus, other.getIssueStatus()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              java.util.Arrays.equals(this.module, other.getModule()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              java.util.Arrays.equals(this.number, other.getNumber()))) &&
            ((this.originalFixedIn==null && other.getOriginalFixedIn()==null) || 
             (this.originalFixedIn!=null &&
              java.util.Arrays.equals(this.originalFixedIn, other.getOriginalFixedIn()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.productTeam==null && other.getProductTeam()==null) || 
             (this.productTeam!=null &&
              java.util.Arrays.equals(this.productTeam, other.getProductTeam()))) &&
            ((this.relatedIssue==null && other.getRelatedIssue()==null) || 
             (this.relatedIssue!=null &&
              java.util.Arrays.equals(this.relatedIssue, other.getRelatedIssue()))) &&
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              java.util.Arrays.equals(this.relationship, other.getRelationship()))) &&
            ((this.relationshipComment==null && other.getRelationshipComment()==null) || 
             (this.relationshipComment!=null &&
              java.util.Arrays.equals(this.relationshipComment, other.getRelationshipComment()))) &&
            ((this.reportedBy==null && other.getReportedBy()==null) || 
             (this.reportedBy!=null &&
              java.util.Arrays.equals(this.reportedBy, other.getReportedBy()))) &&
            ((this.reproduce==null && other.getReproduce()==null) || 
             (this.reproduce!=null &&
              java.util.Arrays.equals(this.reproduce, other.getReproduce()))) &&
            ((this.resolved==null && other.getResolved()==null) || 
             (this.resolved!=null &&
              java.util.Arrays.equals(this.resolved, other.getResolved()))) &&
            ((this.resolvedBy==null && other.getResolvedBy()==null) || 
             (this.resolvedBy!=null &&
              java.util.Arrays.equals(this.resolvedBy, other.getResolvedBy()))) &&
            ((this.reviewer==null && other.getReviewer()==null) || 
             (this.reviewer!=null &&
              java.util.Arrays.equals(this.reviewer, other.getReviewer()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              java.util.Arrays.equals(this.severity, other.getSeverity()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              java.util.Arrays.equals(this.tags, other.getTags()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              java.util.Arrays.equals(this.userType, other.getUserType()))) &&
            ((this.versionBroken==null && other.getVersionBroken()==null) || 
             (this.versionBroken!=null &&
              java.util.Arrays.equals(this.versionBroken, other.getVersionBroken()))) &&
            ((this.versionFixed==null && other.getVersionFixed()==null) || 
             (this.versionFixed!=null &&
              java.util.Arrays.equals(this.versionFixed, other.getVersionFixed()))) &&
            ((this.versionTarget==null && other.getVersionTarget()==null) || 
             (this.versionTarget!=null &&
              java.util.Arrays.equals(this.versionTarget, other.getVersionTarget()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgeInMonths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgeInMonths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildBroken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildBroken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildBroken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildFixed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildFixed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildFixed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildTarget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateReleased() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateReleased());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateReleased(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDuplicateOf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicateOf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicateOf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeOrTeam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeOrTeam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeOrTeam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalFixedIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalFixedIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalFixedIn(), i);
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
        if (getExternalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFixed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFixed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFixed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFixedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFixedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFixedBy(), i);
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
        if (getIsOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsReviewed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsReviewed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsReviewed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsShowStopper() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsShowStopper());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsShowStopper(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginalFixedIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginalFixedIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginalFixedIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTeam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTeam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductTeam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedIssue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationship(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationshipComment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationshipComment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationshipComment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReproduce() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReproduce());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReproduce(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResolved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResolved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResolved(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResolvedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResolvedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResolvedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReviewer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReviewer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReviewer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeverity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeverity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeverity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTags(), i);
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
        if (getUserType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionBroken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionBroken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionBroken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionFixed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionFixed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionFixed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionTarget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "IssueSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ageInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateReleased");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateReleased"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "duplicateOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeOrTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employeeOrTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eventStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalFixedIn"));
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
        elemField.setFieldName("externalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fixedBy"));
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
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "originalFixedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "relatedIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "relationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "relationshipComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resolvedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
