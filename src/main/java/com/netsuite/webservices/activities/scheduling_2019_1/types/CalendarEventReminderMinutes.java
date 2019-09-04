/**
 * CalendarEventReminderMinutes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1.types;

public class CalendarEventReminderMinutes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CalendarEventReminderMinutes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __none = "_none";
    public static final java.lang.String __0minutes = "_0minutes";
    public static final java.lang.String __10minutes = "_10minutes";
    public static final java.lang.String __12hours = "_12hours";
    public static final java.lang.String __15minutes = "_15minutes";
    public static final java.lang.String __1day = "_1day";
    public static final java.lang.String __1hour = "_1hour";
    public static final java.lang.String __1week = "_1week";
    public static final java.lang.String __2days = "_2days";
    public static final java.lang.String __2hours = "_2hours";
    public static final java.lang.String __30minutes = "_30minutes";
    public static final java.lang.String __3days = "_3days";
    public static final java.lang.String __3hours = "_3hours";
    public static final java.lang.String __4hours = "_4hours";
    public static final java.lang.String __5hours = "_5hours";
    public static final java.lang.String __5minutes = "_5minutes";
    public static final java.lang.String __8hours = "_8hours";
    public static final CalendarEventReminderMinutes _none = new CalendarEventReminderMinutes(__none);
    public static final CalendarEventReminderMinutes _0minutes = new CalendarEventReminderMinutes(__0minutes);
    public static final CalendarEventReminderMinutes _10minutes = new CalendarEventReminderMinutes(__10minutes);
    public static final CalendarEventReminderMinutes _12hours = new CalendarEventReminderMinutes(__12hours);
    public static final CalendarEventReminderMinutes _15minutes = new CalendarEventReminderMinutes(__15minutes);
    public static final CalendarEventReminderMinutes _1day = new CalendarEventReminderMinutes(__1day);
    public static final CalendarEventReminderMinutes _1hour = new CalendarEventReminderMinutes(__1hour);
    public static final CalendarEventReminderMinutes _1week = new CalendarEventReminderMinutes(__1week);
    public static final CalendarEventReminderMinutes _2days = new CalendarEventReminderMinutes(__2days);
    public static final CalendarEventReminderMinutes _2hours = new CalendarEventReminderMinutes(__2hours);
    public static final CalendarEventReminderMinutes _30minutes = new CalendarEventReminderMinutes(__30minutes);
    public static final CalendarEventReminderMinutes _3days = new CalendarEventReminderMinutes(__3days);
    public static final CalendarEventReminderMinutes _3hours = new CalendarEventReminderMinutes(__3hours);
    public static final CalendarEventReminderMinutes _4hours = new CalendarEventReminderMinutes(__4hours);
    public static final CalendarEventReminderMinutes _5hours = new CalendarEventReminderMinutes(__5hours);
    public static final CalendarEventReminderMinutes _5minutes = new CalendarEventReminderMinutes(__5minutes);
    public static final CalendarEventReminderMinutes _8hours = new CalendarEventReminderMinutes(__8hours);
    public java.lang.String getValue() { return _value_;}
    public static CalendarEventReminderMinutes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CalendarEventReminderMinutes enumeration = (CalendarEventReminderMinutes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CalendarEventReminderMinutes fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalendarEventReminderMinutes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "CalendarEventReminderMinutes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
