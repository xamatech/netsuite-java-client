/**
 * BomRevisionComponentSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BomRevisionComponentSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] bomQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] bomRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] componentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] itemSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemSubtype;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] units;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weight;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public BomRevisionComponentSearchRowBasic() {
    }

    public BomRevisionComponentSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] bomQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] bomRevision,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] componentYield,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] itemSource,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemSubtype,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] units,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weight,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.bomQuantity = bomQuantity;
        this.bomRevision = bomRevision;
        this.componentYield = componentYield;
        this.description = description;
        this.internalId = internalId;
        this.item = item;
        this.itemSource = itemSource;
        this.itemSubtype = itemSubtype;
        this.itemType = itemType;
        this.lineId = lineId;
        this.quantity = quantity;
        this.units = units;
        this.weight = weight;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the bomQuantity value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return bomQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBomQuantity(int i) {
        return this.bomQuantity[i];
    }

    public void setBomQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.bomQuantity[i] = _value;
    }


    /**
     * Gets the bomRevision value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return bomRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBomRevision() {
        return bomRevision;
    }


    /**
     * Sets the bomRevision value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param bomRevision
     */
    public void setBomRevision(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] bomRevision) {
        this.bomRevision = bomRevision;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBomRevision(int i) {
        return this.bomRevision[i];
    }

    public void setBomRevision(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.bomRevision[i] = _value;
    }


    /**
     * Gets the componentYield value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return componentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param componentYield
     */
    public void setComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] componentYield) {
        this.componentYield = componentYield;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getComponentYield(int i) {
        return this.componentYield[i];
    }

    public void setComponentYield(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.componentYield[i] = _value;
    }


    /**
     * Gets the description value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BomRevisionComponentSearchRowBasic.
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
     * Gets the internalId value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BomRevisionComponentSearchRowBasic.
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
     * Gets the item value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this BomRevisionComponentSearchRowBasic.
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
     * Gets the itemSource value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return itemSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getItemSource() {
        return itemSource;
    }


    /**
     * Sets the itemSource value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param itemSource
     */
    public void setItemSource(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] itemSource) {
        this.itemSource = itemSource;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getItemSource(int i) {
        return this.itemSource[i];
    }

    public void setItemSource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.itemSource[i] = _value;
    }


    /**
     * Gets the itemSubtype value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return itemSubtype
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getItemSubtype() {
        return itemSubtype;
    }


    /**
     * Sets the itemSubtype value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param itemSubtype
     */
    public void setItemSubtype(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemSubtype) {
        this.itemSubtype = itemSubtype;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getItemSubtype(int i) {
        return this.itemSubtype[i];
    }

    public void setItemSubtype(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.itemSubtype[i] = _value;
    }


    /**
     * Gets the itemType value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return itemType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param itemType
     */
    public void setItemType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemType) {
        this.itemType = itemType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItemType(int i) {
        return this.itemType[i];
    }

    public void setItemType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.itemType[i] = _value;
    }


    /**
     * Gets the lineId value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return lineId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLineId() {
        return lineId;
    }


    /**
     * Sets the lineId value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param lineId
     */
    public void setLineId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineId) {
        this.lineId = lineId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLineId(int i) {
        return this.lineId[i];
    }

    public void setLineId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.lineId[i] = _value;
    }


    /**
     * Gets the quantity value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this BomRevisionComponentSearchRowBasic.
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
     * Gets the units value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUnits() {
        return units;
    }


    /**
     * Sets the units value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] units) {
        this.units = units;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.units[i] = _value;
    }


    /**
     * Gets the weight value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return weight
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param weight
     */
    public void setWeight(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] weight) {
        this.weight = weight;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getWeight(int i) {
        return this.weight[i];
    }

    public void setWeight(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.weight[i] = _value;
    }


    /**
     * Gets the customFieldList value for this BomRevisionComponentSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this BomRevisionComponentSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BomRevisionComponentSearchRowBasic)) return false;
        BomRevisionComponentSearchRowBasic other = (BomRevisionComponentSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              java.util.Arrays.equals(this.bomQuantity, other.getBomQuantity()))) &&
            ((this.bomRevision==null && other.getBomRevision()==null) || 
             (this.bomRevision!=null &&
              java.util.Arrays.equals(this.bomRevision, other.getBomRevision()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              java.util.Arrays.equals(this.componentYield, other.getComponentYield()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.itemSource==null && other.getItemSource()==null) || 
             (this.itemSource!=null &&
              java.util.Arrays.equals(this.itemSource, other.getItemSource()))) &&
            ((this.itemSubtype==null && other.getItemSubtype()==null) || 
             (this.itemSubtype!=null &&
              java.util.Arrays.equals(this.itemSubtype, other.getItemSubtype()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              java.util.Arrays.equals(this.itemType, other.getItemType()))) &&
            ((this.lineId==null && other.getLineId()==null) || 
             (this.lineId!=null &&
              java.util.Arrays.equals(this.lineId, other.getLineId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              java.util.Arrays.equals(this.quantity, other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              java.util.Arrays.equals(this.units, other.getUnits()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
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
        if (getBomQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBomQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBomQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBomRevision() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBomRevision());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBomRevision(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentYield() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentYield());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentYield(), i);
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
        if (getItemSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemSubtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemSubtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemSubtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineId(), i);
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
        if (getWeight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeight(), i);
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
        new org.apache.axis.description.TypeDesc(BomRevisionComponentSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BomRevisionComponentSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "weight"));
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
