/**
 * MatrixOptionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class MatrixOptionList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SelectCustomFieldRef[] matrixOption;

    public MatrixOptionList() {
    }

    public MatrixOptionList(
           com.netsuite.webservices.platform.core_2019_1.SelectCustomFieldRef[] matrixOption) {
           this.matrixOption = matrixOption;
    }


    /**
     * Gets the matrixOption value for this MatrixOptionList.
     * 
     * @return matrixOption
     */
    public com.netsuite.webservices.platform.core_2019_1.SelectCustomFieldRef[] getMatrixOption() {
        return matrixOption;
    }


    /**
     * Sets the matrixOption value for this MatrixOptionList.
     * 
     * @param matrixOption
     */
    public void setMatrixOption(com.netsuite.webservices.platform.core_2019_1.SelectCustomFieldRef[] matrixOption) {
        this.matrixOption = matrixOption;
    }

    public com.netsuite.webservices.platform.core_2019_1.SelectCustomFieldRef getMatrixOption(int i) {
        return this.matrixOption[i];
    }

    public void setMatrixOption(int i, com.netsuite.webservices.platform.core_2019_1.SelectCustomFieldRef _value) {
        this.matrixOption[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatrixOptionList)) return false;
        MatrixOptionList other = (MatrixOptionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matrixOption==null && other.getMatrixOption()==null) || 
             (this.matrixOption!=null &&
              java.util.Arrays.equals(this.matrixOption, other.getMatrixOption())));
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
        if (getMatrixOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatrixOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatrixOption(), i);
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
        new org.apache.axis.description.TypeDesc(MatrixOptionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "MatrixOptionList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "matrixOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SelectCustomFieldRef"));
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
