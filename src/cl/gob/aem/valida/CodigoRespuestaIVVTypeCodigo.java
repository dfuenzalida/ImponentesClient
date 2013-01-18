/**
 * CodigoRespuestaIVVTypeCodigo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CodigoRespuestaIVVTypeCodigo implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CodigoRespuestaIVVTypeCodigo(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "0001";
    public static final java.lang.String _value2 = "0002";
    public static final java.lang.String _value3 = "0003";
    public static final java.lang.String _value4 = "0004";
    public static final java.lang.String _value5 = "0005";
    public static final java.lang.String _value6 = "0006";
    public static final java.lang.String _value7 = "0007";
    public static final java.lang.String _value8 = "0008";
    public static final java.lang.String _value9 = "0009";
    public static final java.lang.String _value10 = "0010";
    public static final java.lang.String _value11 = "0011";
    public static final java.lang.String _value12 = "0012";
    public static final java.lang.String _value13 = "0013";
    public static final java.lang.String _value14 = "0014";
    public static final CodigoRespuestaIVVTypeCodigo value1 = new CodigoRespuestaIVVTypeCodigo(_value1);
    public static final CodigoRespuestaIVVTypeCodigo value2 = new CodigoRespuestaIVVTypeCodigo(_value2);
    public static final CodigoRespuestaIVVTypeCodigo value3 = new CodigoRespuestaIVVTypeCodigo(_value3);
    public static final CodigoRespuestaIVVTypeCodigo value4 = new CodigoRespuestaIVVTypeCodigo(_value4);
    public static final CodigoRespuestaIVVTypeCodigo value5 = new CodigoRespuestaIVVTypeCodigo(_value5);
    public static final CodigoRespuestaIVVTypeCodigo value6 = new CodigoRespuestaIVVTypeCodigo(_value6);
    public static final CodigoRespuestaIVVTypeCodigo value7 = new CodigoRespuestaIVVTypeCodigo(_value7);
    public static final CodigoRespuestaIVVTypeCodigo value8 = new CodigoRespuestaIVVTypeCodigo(_value8);
    public static final CodigoRespuestaIVVTypeCodigo value9 = new CodigoRespuestaIVVTypeCodigo(_value9);
    public static final CodigoRespuestaIVVTypeCodigo value10 = new CodigoRespuestaIVVTypeCodigo(_value10);
    public static final CodigoRespuestaIVVTypeCodigo value11 = new CodigoRespuestaIVVTypeCodigo(_value11);
    public static final CodigoRespuestaIVVTypeCodigo value12 = new CodigoRespuestaIVVTypeCodigo(_value12);
    public static final CodigoRespuestaIVVTypeCodigo value13 = new CodigoRespuestaIVVTypeCodigo(_value13);
    public static final CodigoRespuestaIVVTypeCodigo value14 = new CodigoRespuestaIVVTypeCodigo(_value14);
    public java.lang.String getValue() { return _value_;}
    public static CodigoRespuestaIVVTypeCodigo fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CodigoRespuestaIVVTypeCodigo enumeration = (CodigoRespuestaIVVTypeCodigo)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CodigoRespuestaIVVTypeCodigo fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CodigoRespuestaIVVTypeCodigo.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">CodigoRespuestaIVVType>Codigo"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
