/**
 * ItemSupplyPlanSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ItemSupplyPlanSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] orderCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] orderDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] orderType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] receiptDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ItemSupplyPlanSearchRowBasic() {
    }

    public ItemSupplyPlanSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] orderCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] orderDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] orderType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] receiptDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.externalId = externalId;
        this.internalId = internalId;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.memo = memo;
        this.orderCreated = orderCreated;
        this.orderDate = orderDate;
        this.orderType = orderType;
        this.quantity = quantity;
        this.quantityUom = quantityUom;
        this.receiptDate = receiptDate;
        this.subsidiary = subsidiary;
        this.units = units;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the externalId value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemSupplyPlanSearchRowBasic.
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
     * Gets the internalId value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemSupplyPlanSearchRowBasic.
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
     * Gets the item value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this ItemSupplyPlanSearchRowBasic.
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
     * Gets the lastModifiedDate value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the location value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemSupplyPlanSearchRowBasic.
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
     * Gets the memo value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ItemSupplyPlanSearchRowBasic.
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
     * Gets the orderCreated value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return orderCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getOrderCreated() {
        return orderCreated;
    }


    /**
     * Sets the orderCreated value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param orderCreated
     */
    public void setOrderCreated(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] orderCreated) {
        this.orderCreated = orderCreated;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getOrderCreated(int i) {
        return this.orderCreated[i];
    }

    public void setOrderCreated(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.orderCreated[i] = _value;
    }


    /**
     * Gets the orderDate value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return orderDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param orderDate
     */
    public void setOrderDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] orderDate) {
        this.orderDate = orderDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getOrderDate(int i) {
        return this.orderDate[i];
    }

    public void setOrderDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.orderDate[i] = _value;
    }


    /**
     * Gets the orderType value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return orderType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param orderType
     */
    public void setOrderType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] orderType) {
        this.orderType = orderType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOrderType(int i) {
        return this.orderType[i];
    }

    public void setOrderType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.orderType[i] = _value;
    }


    /**
     * Gets the quantity value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }


    /**
     * Gets the quantityUom value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return quantityUom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityUom() {
        return quantityUom;
    }


    /**
     * Sets the quantityUom value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param quantityUom
     */
    public void setQuantityUom(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom) {
        this.quantityUom = quantityUom;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityUom(int i) {
        return this.quantityUom[i];
    }

    public void setQuantityUom(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityUom[i] = _value;
    }


    /**
     * Gets the receiptDate value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return receiptDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getReceiptDate() {
        return receiptDate;
    }


    /**
     * Sets the receiptDate value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param receiptDate
     */
    public void setReceiptDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] receiptDate) {
        this.receiptDate = receiptDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getReceiptDate(int i) {
        return this.receiptDate[i];
    }

    public void setReceiptDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.receiptDate[i] = _value;
    }


    /**
     * Gets the subsidiary value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the units value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units) {
        this.units = units;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.units[i] = _value;
    }


    /**
     * Gets the customFieldList value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemSupplyPlanSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSupplyPlanSearchRowBasic)) return false;
        ItemSupplyPlanSearchRowBasic other = (ItemSupplyPlanSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.orderCreated==null && other.getOrderCreated()==null) || 
             (this.orderCreated!=null &&
              java.util.Arrays.equals(this.orderCreated, other.getOrderCreated()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              java.util.Arrays.equals(this.orderDate, other.getOrderDate()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              java.util.Arrays.equals(this.orderType, other.getOrderType()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              java.util.Arrays.equals(this.quantity, other.getQuantity()))) &&
            ((this.quantityUom==null && other.getQuantityUom()==null) || 
             (this.quantityUom!=null &&
              java.util.Arrays.equals(this.quantityUom, other.getQuantityUom()))) &&
            ((this.receiptDate==null && other.getReceiptDate()==null) || 
             (this.receiptDate!=null &&
              java.util.Arrays.equals(this.receiptDate, other.getReceiptDate()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              java.util.Arrays.equals(this.units, other.getUnits()))) &&
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
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
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
        if (getOrderCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityUom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityUom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityUom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnits(), i);
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
        new org.apache.axis.description.TypeDesc(ItemSupplyPlanSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSupplyPlanSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("orderCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "orderCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityUom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityUom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
