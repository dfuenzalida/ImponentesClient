/**
 * CertificadoCalidadIndigenaNombreEtnia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class CertificadoCalidadIndigenaNombreEtnia implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CertificadoCalidadIndigenaNombreEtnia(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "MAPUCHE";
    public static final java.lang.String _value2 = "DIAGUITA";
    public static final java.lang.String _value3 = "Nulo";
    public static final java.lang.String _value4 = "Sin Información";
    public static final java.lang.String _value5 = "COYAS";
    public static final java.lang.String _value6 = "AYMARÁ";
    public static final java.lang.String _value7 = "ATACAMEÑO";
    public static final java.lang.String _value8 = "KAWASHKAR";
    public static final java.lang.String _value9 = "YAGAN";
    public static final java.lang.String _value10 = "RAPANUÍ";
    public static final java.lang.String _value11 = "QUECHUA";
    public static final java.lang.String _value12 = "NO ÉTNICO";
    public static final CertificadoCalidadIndigenaNombreEtnia value1 = new CertificadoCalidadIndigenaNombreEtnia(_value1);
    public static final CertificadoCalidadIndigenaNombreEtnia value2 = new CertificadoCalidadIndigenaNombreEtnia(_value2);
    public static final CertificadoCalidadIndigenaNombreEtnia value3 = new CertificadoCalidadIndigenaNombreEtnia(_value3);
    public static final CertificadoCalidadIndigenaNombreEtnia value4 = new CertificadoCalidadIndigenaNombreEtnia(_value4);
    public static final CertificadoCalidadIndigenaNombreEtnia value5 = new CertificadoCalidadIndigenaNombreEtnia(_value5);
    public static final CertificadoCalidadIndigenaNombreEtnia value6 = new CertificadoCalidadIndigenaNombreEtnia(_value6);
    public static final CertificadoCalidadIndigenaNombreEtnia value7 = new CertificadoCalidadIndigenaNombreEtnia(_value7);
    public static final CertificadoCalidadIndigenaNombreEtnia value8 = new CertificadoCalidadIndigenaNombreEtnia(_value8);
    public static final CertificadoCalidadIndigenaNombreEtnia value9 = new CertificadoCalidadIndigenaNombreEtnia(_value9);
    public static final CertificadoCalidadIndigenaNombreEtnia value10 = new CertificadoCalidadIndigenaNombreEtnia(_value10);
    public static final CertificadoCalidadIndigenaNombreEtnia value11 = new CertificadoCalidadIndigenaNombreEtnia(_value11);
    public static final CertificadoCalidadIndigenaNombreEtnia value12 = new CertificadoCalidadIndigenaNombreEtnia(_value12);
    public java.lang.String getValue() { return _value_;}
    public static CertificadoCalidadIndigenaNombreEtnia fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CertificadoCalidadIndigenaNombreEtnia enumeration = (CertificadoCalidadIndigenaNombreEtnia)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CertificadoCalidadIndigenaNombreEtnia fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CertificadoCalidadIndigenaNombreEtnia.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>CertificadoCalidadIndigena>NombreEtnia"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
