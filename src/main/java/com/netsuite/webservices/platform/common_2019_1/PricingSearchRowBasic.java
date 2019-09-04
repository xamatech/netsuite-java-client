/**
 * PricingSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class PricingSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] maximumQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] minimumQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priceLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] quantityRange;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] saleUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice;

    public PricingSearchRowBasic() {
    }

    public PricingSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] maximumQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] minimumQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priceLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] quantityRange,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] saleUnit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice) {
        this.currency = currency;
        this.customer = customer;
        this.internalId = internalId;
        this.item = item;
        this.maximumQuantity = maximumQuantity;
        this.minimumQuantity = minimumQuantity;
        this.priceLevel = priceLevel;
        this.quantityRange = quantityRange;
        this.saleUnit = saleUnit;
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the currency value for this PricingSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PricingSearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the customer value for this PricingSearchRowBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this PricingSearchRowBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.customer[i] = _value;
    }


    /**
     * Gets the internalId value for this PricingSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PricingSearchRowBasic.
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
     * Gets the item value for this PricingSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this PricingSearchRowBasic.
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
     * Gets the maximumQuantity value for this PricingSearchRowBasic.
     * 
     * @return maximumQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getMaximumQuantity() {
        return maximumQuantity;
    }


    /**
     * Sets the maximumQuantity value for this PricingSearchRowBasic.
     * 
     * @param maximumQuantity
     */
    public void setMaximumQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getMaximumQuantity(int i) {
        return this.maximumQuantity[i];
    }

    public void setMaximumQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.maximumQuantity[i] = _value;
    }


    /**
     * Gets the minimumQuantity value for this PricingSearchRowBasic.
     * 
     * @return minimumQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this PricingSearchRowBasic.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getMinimumQuantity(int i) {
        return this.minimumQuantity[i];
    }

    public void setMinimumQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.minimumQuantity[i] = _value;
    }


    /**
     * Gets the priceLevel value for this PricingSearchRowBasic.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this PricingSearchRowBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priceLevel) {
        this.priceLevel = priceLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPriceLevel(int i) {
        return this.priceLevel[i];
    }

    public void setPriceLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.priceLevel[i] = _value;
    }


    /**
     * Gets the quantityRange value for this PricingSearchRowBasic.
     * 
     * @return quantityRange
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getQuantityRange() {
        return quantityRange;
    }


    /**
     * Sets the quantityRange value for this PricingSearchRowBasic.
     * 
     * @param quantityRange
     */
    public void setQuantityRange(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] quantityRange) {
        this.quantityRange = quantityRange;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getQuantityRange(int i) {
        return this.quantityRange[i];
    }

    public void setQuantityRange(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.quantityRange[i] = _value;
    }


    /**
     * Gets the saleUnit value for this PricingSearchRowBasic.
     * 
     * @return saleUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this PricingSearchRowBasic.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] saleUnit) {
        this.saleUnit = saleUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSaleUnit(int i) {
        return this.saleUnit[i];
    }

    public void setSaleUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.saleUnit[i] = _value;
    }


    /**
     * Gets the unitPrice value for this PricingSearchRowBasic.
     * 
     * @return unitPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this PricingSearchRowBasic.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice) {
        this.unitPrice = unitPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitPrice(int i) {
        return this.unitPrice[i];
    }

    public void setUnitPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitPrice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricingSearchRowBasic)) return false;
        PricingSearchRowBasic other = (PricingSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.maximumQuantity==null && other.getMaximumQuantity()==null) || 
             (this.maximumQuantity!=null &&
              java.util.Arrays.equals(this.maximumQuantity, other.getMaximumQuantity()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              java.util.Arrays.equals(this.minimumQuantity, other.getMinimumQuantity()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              java.util.Arrays.equals(this.priceLevel, other.getPriceLevel()))) &&
            ((this.quantityRange==null && other.getQuantityRange()==null) || 
             (this.quantityRange!=null &&
              java.util.Arrays.equals(this.quantityRange, other.getQuantityRange()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              java.util.Arrays.equals(this.saleUnit, other.getSaleUnit()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              java.util.Arrays.equals(this.unitPrice, other.getUnitPrice())));
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
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
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
        if (getMaximumQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaximumQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaximumQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMinimumQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMinimumQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMinimumQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityRange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSaleUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSaleUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSaleUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitPrice(), i);
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
        new org.apache.axis.description.TypeDesc(PricingSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PricingSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
