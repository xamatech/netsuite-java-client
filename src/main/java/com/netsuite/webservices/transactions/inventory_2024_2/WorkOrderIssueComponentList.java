/**
 * WorkOrderIssueComponentList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2024_2;

public class WorkOrderIssueComponentList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.inventory_2024_2.WorkOrderIssueComponent[] workOrderIssueComponent;

    private boolean replaceAll;  // attribute

    public WorkOrderIssueComponentList() {
    }

    public WorkOrderIssueComponentList(
           com.netsuite.webservices.transactions.inventory_2024_2.WorkOrderIssueComponent[] workOrderIssueComponent,
           boolean replaceAll) {
           this.workOrderIssueComponent = workOrderIssueComponent;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the workOrderIssueComponent value for this WorkOrderIssueComponentList.
     * 
     * @return workOrderIssueComponent
     */
    public com.netsuite.webservices.transactions.inventory_2024_2.WorkOrderIssueComponent[] getWorkOrderIssueComponent() {
        return workOrderIssueComponent;
    }


    /**
     * Sets the workOrderIssueComponent value for this WorkOrderIssueComponentList.
     * 
     * @param workOrderIssueComponent
     */
    public void setWorkOrderIssueComponent(com.netsuite.webservices.transactions.inventory_2024_2.WorkOrderIssueComponent[] workOrderIssueComponent) {
        this.workOrderIssueComponent = workOrderIssueComponent;
    }

    public com.netsuite.webservices.transactions.inventory_2024_2.WorkOrderIssueComponent getWorkOrderIssueComponent(int i) {
        return this.workOrderIssueComponent[i];
    }

    public void setWorkOrderIssueComponent(int i, com.netsuite.webservices.transactions.inventory_2024_2.WorkOrderIssueComponent _value) {
        this.workOrderIssueComponent[i] = _value;
    }


    /**
     * Gets the replaceAll value for this WorkOrderIssueComponentList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this WorkOrderIssueComponentList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrderIssueComponentList)) return false;
        WorkOrderIssueComponentList other = (WorkOrderIssueComponentList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workOrderIssueComponent==null && other.getWorkOrderIssueComponent()==null) || 
             (this.workOrderIssueComponent!=null &&
              java.util.Arrays.equals(this.workOrderIssueComponent, other.getWorkOrderIssueComponent()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getWorkOrderIssueComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkOrderIssueComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkOrderIssueComponent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkOrderIssueComponentList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2024_2.transactions.webservices.netsuite.com", "WorkOrderIssueComponentList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrderIssueComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2024_2.transactions.webservices.netsuite.com", "workOrderIssueComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2024_2.transactions.webservices.netsuite.com", "WorkOrderIssueComponent"));
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
