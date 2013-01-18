/**
 * CodigoRegionValores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CodigoRegionValores implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CodigoRegionValores(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "15";
    public static final java.lang.String _value2 = "01";
    public static final java.lang.String _value3 = "02";
    public static final java.lang.String _value4 = "03";
    public static final java.lang.String _value5 = "04";
    public static final java.lang.String _value6 = "05";
    public static final java.lang.String _value7 = "06";
    public static final java.lang.String _value8 = "07";
    public static final java.lang.String _value9 = "08";
    public static final java.lang.String _value10 = "09";
    public static final java.lang.String _value11 = "14";
    public static final java.lang.String _value12 = "10";
    public static final java.lang.String _value13 = "11";
    public static final java.lang.String _value14 = "12";
    public static final java.lang.String _value15 = "13";
    public static final CodigoRegionValores value1 = new CodigoRegionValores(_value1);
    public static final CodigoRegionValores value2 = new CodigoRegionValores(_value2);
    public static final CodigoRegionValores value3 = new CodigoRegionValores(_value3);
    public static final CodigoRegionValores value4 = new CodigoRegionValores(_value4);
    public static final CodigoRegionValores value5 = new CodigoRegionValores(_value5);
    public static final CodigoRegionValores value6 = new CodigoRegionValores(_value6);
    public static final CodigoRegionValores value7 = new CodigoRegionValores(_value7);
    public static final CodigoRegionValores value8 = new CodigoRegionValores(_value8);
    public static final CodigoRegionValores value9 = new CodigoRegionValores(_value9);
    public static final CodigoRegionValores value10 = new CodigoRegionValores(_value10);
    public static final CodigoRegionValores value11 = new CodigoRegionValores(_value11);
    public static final CodigoRegionValores value12 = new CodigoRegionValores(_value12);
    public static final CodigoRegionValores value13 = new CodigoRegionValores(_value13);
    public static final CodigoRegionValores value14 = new CodigoRegionValores(_value14);
    public static final CodigoRegionValores value15 = new CodigoRegionValores(_value15);
    public java.lang.String getValue() { return _value_;}
    public static CodigoRegionValores fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CodigoRegionValores enumeration = (CodigoRegionValores)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CodigoRegionValores fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CodigoRegionValores.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "codigoRegionValores"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
