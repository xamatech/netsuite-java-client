/**
 * GeneralTokenSupportedOperationsListList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class GeneralTokenSupportedOperationsListList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentSupportedOperation[] generalTokenSupportedOperationsList;

    public GeneralTokenSupportedOperationsListList() {
    }

    public GeneralTokenSupportedOperationsListList(
           com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentSupportedOperation[] generalTokenSupportedOperationsList) {
           this.generalTokenSupportedOperationsList = generalTokenSupportedOperationsList;
    }


    /**
     * Gets the generalTokenSupportedOperationsList value for this GeneralTokenSupportedOperationsListList.
     * 
     * @return generalTokenSupportedOperationsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentSupportedOperation[] getGeneralTokenSupportedOperationsList() {
        return generalTokenSupportedOperationsList;
    }


    /**
     * Sets the generalTokenSupportedOperationsList value for this GeneralTokenSupportedOperationsListList.
     * 
     * @param generalTokenSupportedOperationsList
     */
    public void setGeneralTokenSupportedOperationsList(com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentSupportedOperation[] generalTokenSupportedOperationsList) {
        this.generalTokenSupportedOperationsList = generalTokenSupportedOperationsList;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentSupportedOperation getGeneralTokenSupportedOperationsList(int i) {
        return this.generalTokenSupportedOperationsList[i];
    }

    public void setGeneralTokenSupportedOperationsList(int i, com.netsuite.webservices.lists.accounting_2019_1.types.PaymentInstrumentSupportedOperation _value) {
        this.generalTokenSupportedOperationsList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneralTokenSupportedOperationsListList)) return false;
        GeneralTokenSupportedOperationsListList other = (GeneralTokenSupportedOperationsListList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generalTokenSupportedOperationsList==null && other.getGeneralTokenSupportedOperationsList()==null) || 
             (this.generalTokenSupportedOperationsList!=null &&
              java.util.Arrays.equals(this.generalTokenSupportedOperationsList, other.getGeneralTokenSupportedOperationsList())));
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
        if (getGeneralTokenSupportedOperationsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneralTokenSupportedOperationsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneralTokenSupportedOperationsList(), i);
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
        new org.apache.axis.description.TypeDesc(GeneralTokenSupportedOperationsListList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "GeneralTokenSupportedOperationsListList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalTokenSupportedOperationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "GeneralTokenSupportedOperationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "PaymentInstrumentSupportedOperation"));
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
