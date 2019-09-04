/**
 * CustomRecordTypePermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomRecordTypePermissions  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef permittedRole;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsPermittedLevel permittedLevel;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsRestriction restriction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultForm;

    private java.lang.Boolean restrictForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef searchForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef searchResults;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef listView;

    private java.lang.Boolean listViewRestricted;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef dashboardView;

    private java.lang.Boolean restrictDashboardView;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sublistView;

    private java.lang.Boolean restrictSublistView;

    public CustomRecordTypePermissions() {
    }

    public CustomRecordTypePermissions(
           com.netsuite.webservices.platform.core_2019_1.RecordRef permittedRole,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsPermittedLevel permittedLevel,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsRestriction restriction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultForm,
           java.lang.Boolean restrictForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef searchForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef searchResults,
           com.netsuite.webservices.platform.core_2019_1.RecordRef listView,
           java.lang.Boolean listViewRestricted,
           com.netsuite.webservices.platform.core_2019_1.RecordRef dashboardView,
           java.lang.Boolean restrictDashboardView,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sublistView,
           java.lang.Boolean restrictSublistView) {
           this.permittedRole = permittedRole;
           this.permittedLevel = permittedLevel;
           this.restriction = restriction;
           this.defaultForm = defaultForm;
           this.restrictForm = restrictForm;
           this.searchForm = searchForm;
           this.searchResults = searchResults;
           this.listView = listView;
           this.listViewRestricted = listViewRestricted;
           this.dashboardView = dashboardView;
           this.restrictDashboardView = restrictDashboardView;
           this.sublistView = sublistView;
           this.restrictSublistView = restrictSublistView;
    }


    /**
     * Gets the permittedRole value for this CustomRecordTypePermissions.
     * 
     * @return permittedRole
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPermittedRole() {
        return permittedRole;
    }


    /**
     * Sets the permittedRole value for this CustomRecordTypePermissions.
     * 
     * @param permittedRole
     */
    public void setPermittedRole(com.netsuite.webservices.platform.core_2019_1.RecordRef permittedRole) {
        this.permittedRole = permittedRole;
    }


    /**
     * Gets the permittedLevel value for this CustomRecordTypePermissions.
     * 
     * @return permittedLevel
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsPermittedLevel getPermittedLevel() {
        return permittedLevel;
    }


    /**
     * Sets the permittedLevel value for this CustomRecordTypePermissions.
     * 
     * @param permittedLevel
     */
    public void setPermittedLevel(com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsPermittedLevel permittedLevel) {
        this.permittedLevel = permittedLevel;
    }


    /**
     * Gets the restriction value for this CustomRecordTypePermissions.
     * 
     * @return restriction
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsRestriction getRestriction() {
        return restriction;
    }


    /**
     * Sets the restriction value for this CustomRecordTypePermissions.
     * 
     * @param restriction
     */
    public void setRestriction(com.netsuite.webservices.setup.customization_2019_1.types.CustomRecordTypePermissionsRestriction restriction) {
        this.restriction = restriction;
    }


    /**
     * Gets the defaultForm value for this CustomRecordTypePermissions.
     * 
     * @return defaultForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultForm() {
        return defaultForm;
    }


    /**
     * Sets the defaultForm value for this CustomRecordTypePermissions.
     * 
     * @param defaultForm
     */
    public void setDefaultForm(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultForm) {
        this.defaultForm = defaultForm;
    }


    /**
     * Gets the restrictForm value for this CustomRecordTypePermissions.
     * 
     * @return restrictForm
     */
    public java.lang.Boolean getRestrictForm() {
        return restrictForm;
    }


    /**
     * Sets the restrictForm value for this CustomRecordTypePermissions.
     * 
     * @param restrictForm
     */
    public void setRestrictForm(java.lang.Boolean restrictForm) {
        this.restrictForm = restrictForm;
    }


    /**
     * Gets the searchForm value for this CustomRecordTypePermissions.
     * 
     * @return searchForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSearchForm() {
        return searchForm;
    }


    /**
     * Sets the searchForm value for this CustomRecordTypePermissions.
     * 
     * @param searchForm
     */
    public void setSearchForm(com.netsuite.webservices.platform.core_2019_1.RecordRef searchForm) {
        this.searchForm = searchForm;
    }


    /**
     * Gets the searchResults value for this CustomRecordTypePermissions.
     * 
     * @return searchResults
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSearchResults() {
        return searchResults;
    }


    /**
     * Sets the searchResults value for this CustomRecordTypePermissions.
     * 
     * @param searchResults
     */
    public void setSearchResults(com.netsuite.webservices.platform.core_2019_1.RecordRef searchResults) {
        this.searchResults = searchResults;
    }


    /**
     * Gets the listView value for this CustomRecordTypePermissions.
     * 
     * @return listView
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getListView() {
        return listView;
    }


    /**
     * Sets the listView value for this CustomRecordTypePermissions.
     * 
     * @param listView
     */
    public void setListView(com.netsuite.webservices.platform.core_2019_1.RecordRef listView) {
        this.listView = listView;
    }


    /**
     * Gets the listViewRestricted value for this CustomRecordTypePermissions.
     * 
     * @return listViewRestricted
     */
    public java.lang.Boolean getListViewRestricted() {
        return listViewRestricted;
    }


    /**
     * Sets the listViewRestricted value for this CustomRecordTypePermissions.
     * 
     * @param listViewRestricted
     */
    public void setListViewRestricted(java.lang.Boolean listViewRestricted) {
        this.listViewRestricted = listViewRestricted;
    }


    /**
     * Gets the dashboardView value for this CustomRecordTypePermissions.
     * 
     * @return dashboardView
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDashboardView() {
        return dashboardView;
    }


    /**
     * Sets the dashboardView value for this CustomRecordTypePermissions.
     * 
     * @param dashboardView
     */
    public void setDashboardView(com.netsuite.webservices.platform.core_2019_1.RecordRef dashboardView) {
        this.dashboardView = dashboardView;
    }


    /**
     * Gets the restrictDashboardView value for this CustomRecordTypePermissions.
     * 
     * @return restrictDashboardView
     */
    public java.lang.Boolean getRestrictDashboardView() {
        return restrictDashboardView;
    }


    /**
     * Sets the restrictDashboardView value for this CustomRecordTypePermissions.
     * 
     * @param restrictDashboardView
     */
    public void setRestrictDashboardView(java.lang.Boolean restrictDashboardView) {
        this.restrictDashboardView = restrictDashboardView;
    }


    /**
     * Gets the sublistView value for this CustomRecordTypePermissions.
     * 
     * @return sublistView
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSublistView() {
        return sublistView;
    }


    /**
     * Sets the sublistView value for this CustomRecordTypePermissions.
     * 
     * @param sublistView
     */
    public void setSublistView(com.netsuite.webservices.platform.core_2019_1.RecordRef sublistView) {
        this.sublistView = sublistView;
    }


    /**
     * Gets the restrictSublistView value for this CustomRecordTypePermissions.
     * 
     * @return restrictSublistView
     */
    public java.lang.Boolean getRestrictSublistView() {
        return restrictSublistView;
    }


    /**
     * Sets the restrictSublistView value for this CustomRecordTypePermissions.
     * 
     * @param restrictSublistView
     */
    public void setRestrictSublistView(java.lang.Boolean restrictSublistView) {
        this.restrictSublistView = restrictSublistView;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypePermissions)) return false;
        CustomRecordTypePermissions other = (CustomRecordTypePermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.permittedRole==null && other.getPermittedRole()==null) || 
             (this.permittedRole!=null &&
              this.permittedRole.equals(other.getPermittedRole()))) &&
            ((this.permittedLevel==null && other.getPermittedLevel()==null) || 
             (this.permittedLevel!=null &&
              this.permittedLevel.equals(other.getPermittedLevel()))) &&
            ((this.restriction==null && other.getRestriction()==null) || 
             (this.restriction!=null &&
              this.restriction.equals(other.getRestriction()))) &&
            ((this.defaultForm==null && other.getDefaultForm()==null) || 
             (this.defaultForm!=null &&
              this.defaultForm.equals(other.getDefaultForm()))) &&
            ((this.restrictForm==null && other.getRestrictForm()==null) || 
             (this.restrictForm!=null &&
              this.restrictForm.equals(other.getRestrictForm()))) &&
            ((this.searchForm==null && other.getSearchForm()==null) || 
             (this.searchForm!=null &&
              this.searchForm.equals(other.getSearchForm()))) &&
            ((this.searchResults==null && other.getSearchResults()==null) || 
             (this.searchResults!=null &&
              this.searchResults.equals(other.getSearchResults()))) &&
            ((this.listView==null && other.getListView()==null) || 
             (this.listView!=null &&
              this.listView.equals(other.getListView()))) &&
            ((this.listViewRestricted==null && other.getListViewRestricted()==null) || 
             (this.listViewRestricted!=null &&
              this.listViewRestricted.equals(other.getListViewRestricted()))) &&
            ((this.dashboardView==null && other.getDashboardView()==null) || 
             (this.dashboardView!=null &&
              this.dashboardView.equals(other.getDashboardView()))) &&
            ((this.restrictDashboardView==null && other.getRestrictDashboardView()==null) || 
             (this.restrictDashboardView!=null &&
              this.restrictDashboardView.equals(other.getRestrictDashboardView()))) &&
            ((this.sublistView==null && other.getSublistView()==null) || 
             (this.sublistView!=null &&
              this.sublistView.equals(other.getSublistView()))) &&
            ((this.restrictSublistView==null && other.getRestrictSublistView()==null) || 
             (this.restrictSublistView!=null &&
              this.restrictSublistView.equals(other.getRestrictSublistView())));
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
        if (getPermittedRole() != null) {
            _hashCode += getPermittedRole().hashCode();
        }
        if (getPermittedLevel() != null) {
            _hashCode += getPermittedLevel().hashCode();
        }
        if (getRestriction() != null) {
            _hashCode += getRestriction().hashCode();
        }
        if (getDefaultForm() != null) {
            _hashCode += getDefaultForm().hashCode();
        }
        if (getRestrictForm() != null) {
            _hashCode += getRestrictForm().hashCode();
        }
        if (getSearchForm() != null) {
            _hashCode += getSearchForm().hashCode();
        }
        if (getSearchResults() != null) {
            _hashCode += getSearchResults().hashCode();
        }
        if (getListView() != null) {
            _hashCode += getListView().hashCode();
        }
        if (getListViewRestricted() != null) {
            _hashCode += getListViewRestricted().hashCode();
        }
        if (getDashboardView() != null) {
            _hashCode += getDashboardView().hashCode();
        }
        if (getRestrictDashboardView() != null) {
            _hashCode += getRestrictDashboardView().hashCode();
        }
        if (getSublistView() != null) {
            _hashCode += getSublistView().hashCode();
        }
        if (getRestrictSublistView() != null) {
            _hashCode += getRestrictSublistView().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypePermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypePermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permittedRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "permittedRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permittedLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "permittedLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsPermittedLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restriction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "restriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsRestriction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "defaultForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "restrictForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "searchForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "searchResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listView");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "listView"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listViewRestricted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "listViewRestricted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardView");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "dashboardView"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictDashboardView");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "restrictDashboardView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sublistView");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "sublistView"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictSublistView");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "restrictSublistView"));
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
