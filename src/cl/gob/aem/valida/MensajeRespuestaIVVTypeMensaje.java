/**
 * MensajeRespuestaIVVTypeMensaje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class MensajeRespuestaIVVTypeMensaje implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MensajeRespuestaIVVTypeMensaje(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "DOCUMENTO RECIBIDO CORRECTAMENTE";
    public static final java.lang.String _value2 = "ERROR DE AUTENTICACION";
    public static final java.lang.String _value3 = "ERROR DE AUTORIZACION";
    public static final java.lang.String _value4 = "ERROR DE PARAMETROS DE ENTRADA";
    public static final java.lang.String _value5 = "ERROR EN XML DE ENTRADA";
    public static final java.lang.String _value6 = "NO EXISTEN DATOS PARA RESPONDER CONSULTA";
    public static final java.lang.String _value7 = "ERROR DE TIMEOUT";
    public static final java.lang.String _value8 = "ERROR DE LOGICA NO CLASIFICABLE";
    public static final java.lang.String _value9 = "FECHA DE RECEPCION INCORRECTA";
    public static final java.lang.String _value10 = "EL DOCUMENTO NO EXISTE";
    public static final java.lang.String _value11 = "DOCUMENTO REPETIDO";
    public static final java.lang.String _value12 = "SERVIDOR OCUPADO";
    public static final java.lang.String _value13 = "MAXIMO DE INTENTOS EXCEDIDO";
    public static final java.lang.String _value14 = "ERROR DE SINCRONIZACION";
    public static final java.lang.String _value15 = "ERROR DE CONSISTENCIA";
    public static final MensajeRespuestaIVVTypeMensaje value1 = new MensajeRespuestaIVVTypeMensaje(_value1);
    public static final MensajeRespuestaIVVTypeMensaje value2 = new MensajeRespuestaIVVTypeMensaje(_value2);
    public static final MensajeRespuestaIVVTypeMensaje value3 = new MensajeRespuestaIVVTypeMensaje(_value3);
    public static final MensajeRespuestaIVVTypeMensaje value4 = new MensajeRespuestaIVVTypeMensaje(_value4);
    public static final MensajeRespuestaIVVTypeMensaje value5 = new MensajeRespuestaIVVTypeMensaje(_value5);
    public static final MensajeRespuestaIVVTypeMensaje value6 = new MensajeRespuestaIVVTypeMensaje(_value6);
    public static final MensajeRespuestaIVVTypeMensaje value7 = new MensajeRespuestaIVVTypeMensaje(_value7);
    public static final MensajeRespuestaIVVTypeMensaje value8 = new MensajeRespuestaIVVTypeMensaje(_value8);
    public static final MensajeRespuestaIVVTypeMensaje value9 = new MensajeRespuestaIVVTypeMensaje(_value9);
    public static final MensajeRespuestaIVVTypeMensaje value10 = new MensajeRespuestaIVVTypeMensaje(_value10);
    public static final MensajeRespuestaIVVTypeMensaje value11 = new MensajeRespuestaIVVTypeMensaje(_value11);
    public static final MensajeRespuestaIVVTypeMensaje value12 = new MensajeRespuestaIVVTypeMensaje(_value12);
    public static final MensajeRespuestaIVVTypeMensaje value13 = new MensajeRespuestaIVVTypeMensaje(_value13);
    public static final MensajeRespuestaIVVTypeMensaje value14 = new MensajeRespuestaIVVTypeMensaje(_value14);
    public static final MensajeRespuestaIVVTypeMensaje value15 = new MensajeRespuestaIVVTypeMensaje(_value15);
    public java.lang.String getValue() { return _value_;}
    public static MensajeRespuestaIVVTypeMensaje fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MensajeRespuestaIVVTypeMensaje enumeration = (MensajeRespuestaIVVTypeMensaje)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MensajeRespuestaIVVTypeMensaje fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MensajeRespuestaIVVTypeMensaje.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">MensajeRespuestaIVVType>Mensaje"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
