/**
 * InventoryNumberSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class InventoryNumberSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expirationDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] inventoryNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isonhand;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityavailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityintransit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityonhand;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityonorder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public InventoryNumberSearchRowBasic() {
    }

    public InventoryNumberSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expirationDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] inventoryNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isonhand,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityavailable,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityintransit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityonhand,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityonorder,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.expirationDate = expirationDate;
        this.externalId = externalId;
        this.internalId = internalId;
        this.inventoryNumber = inventoryNumber;
        this.isonhand = isonhand;
        this.item = item;
        this.location = location;
        this.memo = memo;
        this.quantityavailable = quantityavailable;
        this.quantityintransit = quantityintransit;
        this.quantityonhand = quantityonhand;
        this.quantityonorder = quantityonorder;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the expirationDate value for this InventoryNumberSearchRowBasic.
     * 
     * @return expirationDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this InventoryNumberSearchRowBasic.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expirationDate) {
        this.expirationDate = expirationDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpirationDate(int i) {
        return this.expirationDate[i];
    }

    public void setExpirationDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expirationDate[i] = _value;
    }


    /**
     * Gets the externalId value for this InventoryNumberSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this InventoryNumberSearchRowBasic.
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
     * Gets the internalId value for this InventoryNumberSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InventoryNumberSearchRowBasic.
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
     * Gets the inventoryNumber value for this InventoryNumberSearchRowBasic.
     * 
     * @return inventoryNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getInventoryNumber() {
        return inventoryNumber;
    }


    /**
     * Sets the inventoryNumber value for this InventoryNumberSearchRowBasic.
     * 
     * @param inventoryNumber
     */
    public void setInventoryNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getInventoryNumber(int i) {
        return this.inventoryNumber[i];
    }

    public void setInventoryNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.inventoryNumber[i] = _value;
    }


    /**
     * Gets the isonhand value for this InventoryNumberSearchRowBasic.
     * 
     * @return isonhand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsonhand() {
        return isonhand;
    }


    /**
     * Sets the isonhand value for this InventoryNumberSearchRowBasic.
     * 
     * @param isonhand
     */
    public void setIsonhand(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isonhand) {
        this.isonhand = isonhand;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsonhand(int i) {
        return this.isonhand[i];
    }

    public void setIsonhand(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isonhand[i] = _value;
    }


    /**
     * Gets the item value for this InventoryNumberSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this InventoryNumberSearchRowBasic.
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
     * Gets the location value for this InventoryNumberSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InventoryNumberSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the memo value for this InventoryNumberSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this InventoryNumberSearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the quantityavailable value for this InventoryNumberSearchRowBasic.
     * 
     * @return quantityavailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityavailable() {
        return quantityavailable;
    }


    /**
     * Sets the quantityavailable value for this InventoryNumberSearchRowBasic.
     * 
     * @param quantityavailable
     */
    public void setQuantityavailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityavailable) {
        this.quantityavailable = quantityavailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityavailable(int i) {
        return this.quantityavailable[i];
    }

    public void setQuantityavailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityavailable[i] = _value;
    }


    /**
     * Gets the quantityintransit value for this InventoryNumberSearchRowBasic.
     * 
     * @return quantityintransit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityintransit() {
        return quantityintransit;
    }


    /**
     * Sets the quantityintransit value for this InventoryNumberSearchRowBasic.
     * 
     * @param quantityintransit
     */
    public void setQuantityintransit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityintransit) {
        this.quantityintransit = quantityintransit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityintransit(int i) {
        return this.quantityintransit[i];
    }

    public void setQuantityintransit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityintransit[i] = _value;
    }


    /**
     * Gets the quantityonhand value for this InventoryNumberSearchRowBasic.
     * 
     * @return quantityonhand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityonhand() {
        return quantityonhand;
    }


    /**
     * Sets the quantityonhand value for this InventoryNumberSearchRowBasic.
     * 
     * @param quantityonhand
     */
    public void setQuantityonhand(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityonhand) {
        this.quantityonhand = quantityonhand;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityonhand(int i) {
        return this.quantityonhand[i];
    }

    public void setQuantityonhand(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityonhand[i] = _value;
    }


    /**
     * Gets the quantityonorder value for this InventoryNumberSearchRowBasic.
     * 
     * @return quantityonorder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityonorder() {
        return quantityonorder;
    }


    /**
     * Sets the quantityonorder value for this InventoryNumberSearchRowBasic.
     * 
     * @param quantityonorder
     */
    public void setQuantityonorder(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityonorder) {
        this.quantityonorder = quantityonorder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityonorder(int i) {
        return this.quantityonorder[i];
    }

    public void setQuantityonorder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityonorder[i] = _value;
    }


    /**
     * Gets the customFieldList value for this InventoryNumberSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InventoryNumberSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryNumberSearchRowBasic)) return false;
        InventoryNumberSearchRowBasic other = (InventoryNumberSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              java.util.Arrays.equals(this.expirationDate, other.getExpirationDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.inventoryNumber==null && other.getInventoryNumber()==null) || 
             (this.inventoryNumber!=null &&
              java.util.Arrays.equals(this.inventoryNumber, other.getInventoryNumber()))) &&
            ((this.isonhand==null && other.getIsonhand()==null) || 
             (this.isonhand!=null &&
              java.util.Arrays.equals(this.isonhand, other.getIsonhand()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.quantityavailable==null && other.getQuantityavailable()==null) || 
             (this.quantityavailable!=null &&
              java.util.Arrays.equals(this.quantityavailable, other.getQuantityavailable()))) &&
            ((this.quantityintransit==null && other.getQuantityintransit()==null) || 
             (this.quantityintransit!=null &&
              java.util.Arrays.equals(this.quantityintransit, other.getQuantityintransit()))) &&
            ((this.quantityonhand==null && other.getQuantityonhand()==null) || 
             (this.quantityonhand!=null &&
              java.util.Arrays.equals(this.quantityonhand, other.getQuantityonhand()))) &&
            ((this.quantityonorder==null && other.getQuantityonorder()==null) || 
             (this.quantityonorder!=null &&
              java.util.Arrays.equals(this.quantityonorder, other.getQuantityonorder()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getExpirationDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpirationDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpirationDate(), i);
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
        if (getInventoryNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventoryNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventoryNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsonhand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsonhand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsonhand(), i);
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
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityavailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityavailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityavailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityintransit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityintransit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityintransit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityonhand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityonhand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityonhand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityonorder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityonorder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityonorder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryNumberSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryNumberSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("inventoryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isonhand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isonhand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityavailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityavailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityintransit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityintransit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityonhand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityonhand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityonorder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityonorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
