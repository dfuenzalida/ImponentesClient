/**
 * EstadoSobreType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class EstadoSobreType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EstadoSobreType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "00";
    public static final java.lang.String _value2 = "01";
    public static final java.lang.String _value3 = "02";
    public static final java.lang.String _value4 = "03";
    public static final java.lang.String _value5 = "04";
    public static final java.lang.String _value6 = "05";
    public static final java.lang.String _value7 = "06";
    public static final java.lang.String _value8 = "07";
    public static final java.lang.String _value9 = "08";
    public static final java.lang.String _value10 = "-01";
    public static final java.lang.String _value11 = "-02";
    public static final java.lang.String _value12 = "-03";
    public static final java.lang.String _value13 = "-04";
    public static final EstadoSobreType value1 = new EstadoSobreType(_value1);
    public static final EstadoSobreType value2 = new EstadoSobreType(_value2);
    public static final EstadoSobreType value3 = new EstadoSobreType(_value3);
    public static final EstadoSobreType value4 = new EstadoSobreType(_value4);
    public static final EstadoSobreType value5 = new EstadoSobreType(_value5);
    public static final EstadoSobreType value6 = new EstadoSobreType(_value6);
    public static final EstadoSobreType value7 = new EstadoSobreType(_value7);
    public static final EstadoSobreType value8 = new EstadoSobreType(_value8);
    public static final EstadoSobreType value9 = new EstadoSobreType(_value9);
    public static final EstadoSobreType value10 = new EstadoSobreType(_value10);
    public static final EstadoSobreType value11 = new EstadoSobreType(_value11);
    public static final EstadoSobreType value12 = new EstadoSobreType(_value12);
    public static final EstadoSobreType value13 = new EstadoSobreType(_value13);
    public java.lang.String getValue() { return _value_;}
    public static EstadoSobreType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EstadoSobreType enumeration = (EstadoSobreType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EstadoSobreType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EstadoSobreType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "estadoSobreType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
