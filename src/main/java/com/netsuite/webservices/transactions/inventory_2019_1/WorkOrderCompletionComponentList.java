/**
 * WorkOrderCompletionComponentList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class WorkOrderCompletionComponentList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionComponent[] workOrderCompletionComponent;

    private boolean replaceAll;  // attribute

    public WorkOrderCompletionComponentList() {
    }

    public WorkOrderCompletionComponentList(
           com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionComponent[] workOrderCompletionComponent,
           boolean replaceAll) {
           this.workOrderCompletionComponent = workOrderCompletionComponent;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the workOrderCompletionComponent value for this WorkOrderCompletionComponentList.
     * 
     * @return workOrderCompletionComponent
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionComponent[] getWorkOrderCompletionComponent() {
        return workOrderCompletionComponent;
    }


    /**
     * Sets the workOrderCompletionComponent value for this WorkOrderCompletionComponentList.
     * 
     * @param workOrderCompletionComponent
     */
    public void setWorkOrderCompletionComponent(com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionComponent[] workOrderCompletionComponent) {
        this.workOrderCompletionComponent = workOrderCompletionComponent;
    }

    public com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionComponent getWorkOrderCompletionComponent(int i) {
        return this.workOrderCompletionComponent[i];
    }

    public void setWorkOrderCompletionComponent(int i, com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionComponent _value) {
        this.workOrderCompletionComponent[i] = _value;
    }


    /**
     * Gets the replaceAll value for this WorkOrderCompletionComponentList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this WorkOrderCompletionComponentList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrderCompletionComponentList)) return false;
        WorkOrderCompletionComponentList other = (WorkOrderCompletionComponentList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workOrderCompletionComponent==null && other.getWorkOrderCompletionComponent()==null) || 
             (this.workOrderCompletionComponent!=null &&
              java.util.Arrays.equals(this.workOrderCompletionComponent, other.getWorkOrderCompletionComponent()))) &&
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
        if (getWorkOrderCompletionComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkOrderCompletionComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkOrderCompletionComponent(), i);
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
        new org.apache.axis.description.TypeDesc(WorkOrderCompletionComponentList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderCompletionComponentList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrderCompletionComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "workOrderCompletionComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderCompletionComponent"));
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
