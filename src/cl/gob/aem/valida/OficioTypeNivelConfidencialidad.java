/**
 * OficioTypeNivelConfidencialidad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class OficioTypeNivelConfidencialidad implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OficioTypeNivelConfidencialidad(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PUBLICO = "PUBLICO";
    public static final java.lang.String _RESERVADO = "RESERVADO";
    public static final java.lang.String _SECRETO = "SECRETO";
    public static final OficioTypeNivelConfidencialidad PUBLICO = new OficioTypeNivelConfidencialidad(_PUBLICO);
    public static final OficioTypeNivelConfidencialidad RESERVADO = new OficioTypeNivelConfidencialidad(_RESERVADO);
    public static final OficioTypeNivelConfidencialidad SECRETO = new OficioTypeNivelConfidencialidad(_SECRETO);
    public java.lang.String getValue() { return _value_;}
    public static OficioTypeNivelConfidencialidad fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OficioTypeNivelConfidencialidad enumeration = (OficioTypeNivelConfidencialidad)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OficioTypeNivelConfidencialidad fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OficioTypeNivelConfidencialidad.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">OficioType>NivelConfidencialidad"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
