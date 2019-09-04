/**
 * WorkOrderCompletionOperationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class WorkOrderCompletionOperationList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionOperation[] workOrderCompletionOperation;

    private boolean replaceAll;  // attribute

    public WorkOrderCompletionOperationList() {
    }

    public WorkOrderCompletionOperationList(
           com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionOperation[] workOrderCompletionOperation,
           boolean replaceAll) {
           this.workOrderCompletionOperation = workOrderCompletionOperation;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the workOrderCompletionOperation value for this WorkOrderCompletionOperationList.
     * 
     * @return workOrderCompletionOperation
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionOperation[] getWorkOrderCompletionOperation() {
        return workOrderCompletionOperation;
    }


    /**
     * Sets the workOrderCompletionOperation value for this WorkOrderCompletionOperationList.
     * 
     * @param workOrderCompletionOperation
     */
    public void setWorkOrderCompletionOperation(com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionOperation[] workOrderCompletionOperation) {
        this.workOrderCompletionOperation = workOrderCompletionOperation;
    }

    public com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionOperation getWorkOrderCompletionOperation(int i) {
        return this.workOrderCompletionOperation[i];
    }

    public void setWorkOrderCompletionOperation(int i, com.netsuite.webservices.transactions.inventory_2019_1.WorkOrderCompletionOperation _value) {
        this.workOrderCompletionOperation[i] = _value;
    }


    /**
     * Gets the replaceAll value for this WorkOrderCompletionOperationList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this WorkOrderCompletionOperationList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrderCompletionOperationList)) return false;
        WorkOrderCompletionOperationList other = (WorkOrderCompletionOperationList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workOrderCompletionOperation==null && other.getWorkOrderCompletionOperation()==null) || 
             (this.workOrderCompletionOperation!=null &&
              java.util.Arrays.equals(this.workOrderCompletionOperation, other.getWorkOrderCompletionOperation()))) &&
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
        if (getWorkOrderCompletionOperation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkOrderCompletionOperation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkOrderCompletionOperation(), i);
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
        new org.apache.axis.description.TypeDesc(WorkOrderCompletionOperationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderCompletionOperationList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrderCompletionOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "workOrderCompletionOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderCompletionOperation"));
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
