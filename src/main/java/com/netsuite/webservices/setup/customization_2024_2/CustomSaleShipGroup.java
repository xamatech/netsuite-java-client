/**
 * CustomSaleShipGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2024_2;

public class CustomSaleShipGroup  implements java.io.Serializable {
    private java.lang.String sourceAddress;

    private java.lang.String destinationAddress;

    private java.lang.String shippingMethod;

    private java.lang.Double shippingRate;

    private java.lang.Double handlingRate;

    private java.lang.Long id;

    private java.lang.String isFulfilled;

    private java.lang.Double weight;

    private java.lang.String sourceAddressRef;

    private java.lang.String destinationAddressRef;

    private java.lang.String shippingMethodRef;

    public CustomSaleShipGroup() {
    }

    public CustomSaleShipGroup(
           java.lang.String sourceAddress,
           java.lang.String destinationAddress,
           java.lang.String shippingMethod,
           java.lang.Double shippingRate,
           java.lang.Double handlingRate,
           java.lang.Long id,
           java.lang.String isFulfilled,
           java.lang.Double weight,
           java.lang.String sourceAddressRef,
           java.lang.String destinationAddressRef,
           java.lang.String shippingMethodRef) {
           this.sourceAddress = sourceAddress;
           this.destinationAddress = destinationAddress;
           this.shippingMethod = shippingMethod;
           this.shippingRate = shippingRate;
           this.handlingRate = handlingRate;
           this.id = id;
           this.isFulfilled = isFulfilled;
           this.weight = weight;
           this.sourceAddressRef = sourceAddressRef;
           this.destinationAddressRef = destinationAddressRef;
           this.shippingMethodRef = shippingMethodRef;
    }


    /**
     * Gets the sourceAddress value for this CustomSaleShipGroup.
     * 
     * @return sourceAddress
     */
    public java.lang.String getSourceAddress() {
        return sourceAddress;
    }


    /**
     * Sets the sourceAddress value for this CustomSaleShipGroup.
     * 
     * @param sourceAddress
     */
    public void setSourceAddress(java.lang.String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }


    /**
     * Gets the destinationAddress value for this CustomSaleShipGroup.
     * 
     * @return destinationAddress
     */
    public java.lang.String getDestinationAddress() {
        return destinationAddress;
    }


    /**
     * Sets the destinationAddress value for this CustomSaleShipGroup.
     * 
     * @param destinationAddress
     */
    public void setDestinationAddress(java.lang.String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    /**
     * Gets the shippingMethod value for this CustomSaleShipGroup.
     * 
     * @return shippingMethod
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this CustomSaleShipGroup.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the shippingRate value for this CustomSaleShipGroup.
     * 
     * @return shippingRate
     */
    public java.lang.Double getShippingRate() {
        return shippingRate;
    }


    /**
     * Sets the shippingRate value for this CustomSaleShipGroup.
     * 
     * @param shippingRate
     */
    public void setShippingRate(java.lang.Double shippingRate) {
        this.shippingRate = shippingRate;
    }


    /**
     * Gets the handlingRate value for this CustomSaleShipGroup.
     * 
     * @return handlingRate
     */
    public java.lang.Double getHandlingRate() {
        return handlingRate;
    }


    /**
     * Sets the handlingRate value for this CustomSaleShipGroup.
     * 
     * @param handlingRate
     */
    public void setHandlingRate(java.lang.Double handlingRate) {
        this.handlingRate = handlingRate;
    }


    /**
     * Gets the id value for this CustomSaleShipGroup.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomSaleShipGroup.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isFulfilled value for this CustomSaleShipGroup.
     * 
     * @return isFulfilled
     */
    public java.lang.String getIsFulfilled() {
        return isFulfilled;
    }


    /**
     * Sets the isFulfilled value for this CustomSaleShipGroup.
     * 
     * @param isFulfilled
     */
    public void setIsFulfilled(java.lang.String isFulfilled) {
        this.isFulfilled = isFulfilled;
    }


    /**
     * Gets the weight value for this CustomSaleShipGroup.
     * 
     * @return weight
     */
    public java.lang.Double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this CustomSaleShipGroup.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Double weight) {
        this.weight = weight;
    }


    /**
     * Gets the sourceAddressRef value for this CustomSaleShipGroup.
     * 
     * @return sourceAddressRef
     */
    public java.lang.String getSourceAddressRef() {
        return sourceAddressRef;
    }


    /**
     * Sets the sourceAddressRef value for this CustomSaleShipGroup.
     * 
     * @param sourceAddressRef
     */
    public void setSourceAddressRef(java.lang.String sourceAddressRef) {
        this.sourceAddressRef = sourceAddressRef;
    }


    /**
     * Gets the destinationAddressRef value for this CustomSaleShipGroup.
     * 
     * @return destinationAddressRef
     */
    public java.lang.String getDestinationAddressRef() {
        return destinationAddressRef;
    }


    /**
     * Sets the destinationAddressRef value for this CustomSaleShipGroup.
     * 
     * @param destinationAddressRef
     */
    public void setDestinationAddressRef(java.lang.String destinationAddressRef) {
        this.destinationAddressRef = destinationAddressRef;
    }


    /**
     * Gets the shippingMethodRef value for this CustomSaleShipGroup.
     * 
     * @return shippingMethodRef
     */
    public java.lang.String getShippingMethodRef() {
        return shippingMethodRef;
    }


    /**
     * Sets the shippingMethodRef value for this CustomSaleShipGroup.
     * 
     * @param shippingMethodRef
     */
    public void setShippingMethodRef(java.lang.String shippingMethodRef) {
        this.shippingMethodRef = shippingMethodRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomSaleShipGroup)) return false;
        CustomSaleShipGroup other = (CustomSaleShipGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceAddress==null && other.getSourceAddress()==null) || 
             (this.sourceAddress!=null &&
              this.sourceAddress.equals(other.getSourceAddress()))) &&
            ((this.destinationAddress==null && other.getDestinationAddress()==null) || 
             (this.destinationAddress!=null &&
              this.destinationAddress.equals(other.getDestinationAddress()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.shippingRate==null && other.getShippingRate()==null) || 
             (this.shippingRate!=null &&
              this.shippingRate.equals(other.getShippingRate()))) &&
            ((this.handlingRate==null && other.getHandlingRate()==null) || 
             (this.handlingRate!=null &&
              this.handlingRate.equals(other.getHandlingRate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isFulfilled==null && other.getIsFulfilled()==null) || 
             (this.isFulfilled!=null &&
              this.isFulfilled.equals(other.getIsFulfilled()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.sourceAddressRef==null && other.getSourceAddressRef()==null) || 
             (this.sourceAddressRef!=null &&
              this.sourceAddressRef.equals(other.getSourceAddressRef()))) &&
            ((this.destinationAddressRef==null && other.getDestinationAddressRef()==null) || 
             (this.destinationAddressRef!=null &&
              this.destinationAddressRef.equals(other.getDestinationAddressRef()))) &&
            ((this.shippingMethodRef==null && other.getShippingMethodRef()==null) || 
             (this.shippingMethodRef!=null &&
              this.shippingMethodRef.equals(other.getShippingMethodRef())));
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
        if (getSourceAddress() != null) {
            _hashCode += getSourceAddress().hashCode();
        }
        if (getDestinationAddress() != null) {
            _hashCode += getDestinationAddress().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getShippingRate() != null) {
            _hashCode += getShippingRate().hashCode();
        }
        if (getHandlingRate() != null) {
            _hashCode += getHandlingRate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsFulfilled() != null) {
            _hashCode += getIsFulfilled().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getSourceAddressRef() != null) {
            _hashCode += getSourceAddressRef().hashCode();
        }
        if (getDestinationAddressRef() != null) {
            _hashCode += getDestinationAddressRef().hashCode();
        }
        if (getShippingMethodRef() != null) {
            _hashCode += getShippingMethodRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomSaleShipGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomSaleShipGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "sourceAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "destinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "shippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "handlingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "isFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAddressRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "sourceAddressRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddressRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "destinationAddressRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethodRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "shippingMethodRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
