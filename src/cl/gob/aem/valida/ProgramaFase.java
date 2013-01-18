/**
 * ProgramaFase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ProgramaFase implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProgramaFase(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACTIVA = "ACTIVA";
    public static final java.lang.String _SEGUIMIENTO = "SEGUIMIENTO";
    public static final java.lang.String _EGRESADA = "EGRESADA";
    public static final java.lang.String _INTERRUMPIDA = "INTERRUMPIDA";
    public static final java.lang.String _INUBICABLE = "INUBICABLE";
    public static final ProgramaFase ACTIVA = new ProgramaFase(_ACTIVA);
    public static final ProgramaFase SEGUIMIENTO = new ProgramaFase(_SEGUIMIENTO);
    public static final ProgramaFase EGRESADA = new ProgramaFase(_EGRESADA);
    public static final ProgramaFase INTERRUMPIDA = new ProgramaFase(_INTERRUMPIDA);
    public static final ProgramaFase INUBICABLE = new ProgramaFase(_INUBICABLE);
    public java.lang.String getValue() { return _value_;}
    public static ProgramaFase fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProgramaFase enumeration = (ProgramaFase)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProgramaFase fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProgramaFase.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">Programa>Fase"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
