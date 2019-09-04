/**
 * TaxTypeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaxTypeSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] doesNotAddToTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nexus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] postToItemCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] receivablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] reverseCharge;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxInNetAmount;

    public TaxTypeSearchRowBasic() {
    }

    public TaxTypeSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] doesNotAddToTotal,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nexus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payablesAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] postToItemCost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] receivablesAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] reverseCharge,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxInNetAmount) {
        this.country = country;
        this.description = description;
        this.doesNotAddToTotal = doesNotAddToTotal;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.name = name;
        this.nexus = nexus;
        this.payablesAccount = payablesAccount;
        this.postToItemCost = postToItemCost;
        this.receivablesAccount = receivablesAccount;
        this.reverseCharge = reverseCharge;
        this.taxInNetAmount = taxInNetAmount;
    }


    /**
     * Gets the country value for this TaxTypeSearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this TaxTypeSearchRowBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the description value for this TaxTypeSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaxTypeSearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description) {
        this.description = description;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the doesNotAddToTotal value for this TaxTypeSearchRowBasic.
     * 
     * @return doesNotAddToTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDoesNotAddToTotal() {
        return doesNotAddToTotal;
    }


    /**
     * Sets the doesNotAddToTotal value for this TaxTypeSearchRowBasic.
     * 
     * @param doesNotAddToTotal
     */
    public void setDoesNotAddToTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] doesNotAddToTotal) {
        this.doesNotAddToTotal = doesNotAddToTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDoesNotAddToTotal(int i) {
        return this.doesNotAddToTotal[i];
    }

    public void setDoesNotAddToTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.doesNotAddToTotal[i] = _value;
    }


    /**
     * Gets the externalId value for this TaxTypeSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TaxTypeSearchRowBasic.
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
     * Gets the internalId value for this TaxTypeSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TaxTypeSearchRowBasic.
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
     * Gets the isInactive value for this TaxTypeSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TaxTypeSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the name value for this TaxTypeSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TaxTypeSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the nexus value for this TaxTypeSearchRowBasic.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this TaxTypeSearchRowBasic.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nexus) {
        this.nexus = nexus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getNexus(int i) {
        return this.nexus[i];
    }

    public void setNexus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.nexus[i] = _value;
    }


    /**
     * Gets the payablesAccount value for this TaxTypeSearchRowBasic.
     * 
     * @return payablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPayablesAccount() {
        return payablesAccount;
    }


    /**
     * Sets the payablesAccount value for this TaxTypeSearchRowBasic.
     * 
     * @param payablesAccount
     */
    public void setPayablesAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payablesAccount) {
        this.payablesAccount = payablesAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPayablesAccount(int i) {
        return this.payablesAccount[i];
    }

    public void setPayablesAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.payablesAccount[i] = _value;
    }


    /**
     * Gets the postToItemCost value for this TaxTypeSearchRowBasic.
     * 
     * @return postToItemCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPostToItemCost() {
        return postToItemCost;
    }


    /**
     * Sets the postToItemCost value for this TaxTypeSearchRowBasic.
     * 
     * @param postToItemCost
     */
    public void setPostToItemCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] postToItemCost) {
        this.postToItemCost = postToItemCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPostToItemCost(int i) {
        return this.postToItemCost[i];
    }

    public void setPostToItemCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.postToItemCost[i] = _value;
    }


    /**
     * Gets the receivablesAccount value for this TaxTypeSearchRowBasic.
     * 
     * @return receivablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getReceivablesAccount() {
        return receivablesAccount;
    }


    /**
     * Sets the receivablesAccount value for this TaxTypeSearchRowBasic.
     * 
     * @param receivablesAccount
     */
    public void setReceivablesAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getReceivablesAccount(int i) {
        return this.receivablesAccount[i];
    }

    public void setReceivablesAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.receivablesAccount[i] = _value;
    }


    /**
     * Gets the reverseCharge value for this TaxTypeSearchRowBasic.
     * 
     * @return reverseCharge
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getReverseCharge() {
        return reverseCharge;
    }


    /**
     * Sets the reverseCharge value for this TaxTypeSearchRowBasic.
     * 
     * @param reverseCharge
     */
    public void setReverseCharge(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] reverseCharge) {
        this.reverseCharge = reverseCharge;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getReverseCharge(int i) {
        return this.reverseCharge[i];
    }

    public void setReverseCharge(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.reverseCharge[i] = _value;
    }


    /**
     * Gets the taxInNetAmount value for this TaxTypeSearchRowBasic.
     * 
     * @return taxInNetAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTaxInNetAmount() {
        return taxInNetAmount;
    }


    /**
     * Sets the taxInNetAmount value for this TaxTypeSearchRowBasic.
     * 
     * @param taxInNetAmount
     */
    public void setTaxInNetAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxInNetAmount) {
        this.taxInNetAmount = taxInNetAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTaxInNetAmount(int i) {
        return this.taxInNetAmount[i];
    }

    public void setTaxInNetAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.taxInNetAmount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxTypeSearchRowBasic)) return false;
        TaxTypeSearchRowBasic other = (TaxTypeSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.doesNotAddToTotal==null && other.getDoesNotAddToTotal()==null) || 
             (this.doesNotAddToTotal!=null &&
              java.util.Arrays.equals(this.doesNotAddToTotal, other.getDoesNotAddToTotal()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              java.util.Arrays.equals(this.nexus, other.getNexus()))) &&
            ((this.payablesAccount==null && other.getPayablesAccount()==null) || 
             (this.payablesAccount!=null &&
              java.util.Arrays.equals(this.payablesAccount, other.getPayablesAccount()))) &&
            ((this.postToItemCost==null && other.getPostToItemCost()==null) || 
             (this.postToItemCost!=null &&
              java.util.Arrays.equals(this.postToItemCost, other.getPostToItemCost()))) &&
            ((this.receivablesAccount==null && other.getReceivablesAccount()==null) || 
             (this.receivablesAccount!=null &&
              java.util.Arrays.equals(this.receivablesAccount, other.getReceivablesAccount()))) &&
            ((this.reverseCharge==null && other.getReverseCharge()==null) || 
             (this.reverseCharge!=null &&
              java.util.Arrays.equals(this.reverseCharge, other.getReverseCharge()))) &&
            ((this.taxInNetAmount==null && other.getTaxInNetAmount()==null) || 
             (this.taxInNetAmount!=null &&
              java.util.Arrays.equals(this.taxInNetAmount, other.getTaxInNetAmount())));
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
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDoesNotAddToTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDoesNotAddToTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDoesNotAddToTotal(), i);
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
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNexus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNexus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNexus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayablesAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayablesAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayablesAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostToItemCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostToItemCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostToItemCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceivablesAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivablesAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivablesAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReverseCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReverseCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReverseCharge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxInNetAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxInNetAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxInNetAmount(), i);
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
        new org.apache.axis.description.TypeDesc(TaxTypeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxTypeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doesNotAddToTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "doesNotAddToTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postToItemCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postToItemCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reverseCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxInNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxInNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
