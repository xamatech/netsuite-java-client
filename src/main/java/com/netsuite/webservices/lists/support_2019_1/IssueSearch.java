/**
 * IssueSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class IssueSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntityGroupSearchBasic productTeamJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public IssueSearch() {
    }

    public IssueSearch(
           com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.EntityGroupSearchBasic productTeamJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.caseJoin = caseJoin;
        this.employeeJoin = employeeJoin;
        this.fileJoin = fileJoin;
        this.productTeamJoin = productTeamJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this IssueSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this IssueSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the caseJoin value for this IssueSearch.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this IssueSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the employeeJoin value for this IssueSearch.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this IssueSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the fileJoin value for this IssueSearch.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this IssueSearch.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the productTeamJoin value for this IssueSearch.
     * 
     * @return productTeamJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntityGroupSearchBasic getProductTeamJoin() {
        return productTeamJoin;
    }


    /**
     * Sets the productTeamJoin value for this IssueSearch.
     * 
     * @param productTeamJoin
     */
    public void setProductTeamJoin(com.netsuite.webservices.platform.common_2019_1.EntityGroupSearchBasic productTeamJoin) {
        this.productTeamJoin = productTeamJoin;
    }


    /**
     * Gets the userJoin value for this IssueSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this IssueSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this IssueSearch.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this IssueSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the customSearchJoin value for this IssueSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this IssueSearch.
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
        if (!(obj instanceof IssueSearch)) return false;
        IssueSearch other = (IssueSearch) obj;
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
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.productTeamJoin==null && other.getProductTeamJoin()==null) || 
             (this.productTeamJoin!=null &&
              this.productTeamJoin.equals(other.getProductTeamJoin()))) &&
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
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getProductTeamJoin() != null) {
            _hashCode += getProductTeamJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(IssueSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "IssueSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTeamJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "productTeamJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityGroupSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "customSearchJoin"));
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
