/**
 * ParentescoValores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class ParentescoValores implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ParentescoValores(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PADRE = "PADRE";
    public static final java.lang.String _MADRE = "MADRE";
    public static final java.lang.String _ABUELO = "ABUELO";
    public static final java.lang.String _ABUELA = "ABUELA";
    public static final java.lang.String _HIJO = "HIJO";
    public static final java.lang.String _HIJA = "HIJA";
    public static final java.lang.String _NIETA = "NIETA";
    public static final java.lang.String _NIETO = "NIETO";
    public static final ParentescoValores PADRE = new ParentescoValores(_PADRE);
    public static final ParentescoValores MADRE = new ParentescoValores(_MADRE);
    public static final ParentescoValores ABUELO = new ParentescoValores(_ABUELO);
    public static final ParentescoValores ABUELA = new ParentescoValores(_ABUELA);
    public static final ParentescoValores HIJO = new ParentescoValores(_HIJO);
    public static final ParentescoValores HIJA = new ParentescoValores(_HIJA);
    public static final ParentescoValores NIETA = new ParentescoValores(_NIETA);
    public static final ParentescoValores NIETO = new ParentescoValores(_NIETO);
    public java.lang.String getValue() { return _value_;}
    public static ParentescoValores fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ParentescoValores enumeration = (ParentescoValores)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ParentescoValores fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ParentescoValores.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "parentescoValores"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
