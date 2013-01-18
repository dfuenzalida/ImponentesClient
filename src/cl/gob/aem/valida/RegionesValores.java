/**
 * RegionesValores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class RegionesValores implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RegionesValores(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "ARICA Y PARINACOTA";
    public static final java.lang.String _value2 = "TARAPACA";
    public static final java.lang.String _value3 = "ANTOFAGASTA";
    public static final java.lang.String _value4 = "ATACAMA";
    public static final java.lang.String _value5 = "COQUIMBO";
    public static final java.lang.String _value6 = "VALPARAISO";
    public static final java.lang.String _value7 = "REGION DEL LIBERTADOR GRAL. BERNARDO O'HIGGINS";
    public static final java.lang.String _value8 = "REGION DEL MAULE";
    public static final java.lang.String _value9 = "REGION DEL BIOBIO";
    public static final java.lang.String _value10 = "REGION DE LA ARAUCANIA";
    public static final java.lang.String _value11 = "REGION DE LOS RIOS";
    public static final java.lang.String _value12 = "REGION DE LOS LAGOS";
    public static final java.lang.String _value13 = "REGION AISEN DEL GRAL. CARLOS IBAÑEZ DEL CAMPO";
    public static final java.lang.String _value14 = "REGION DE MAGALLANES Y DE LA ANTARTICA CHILENA";
    public static final java.lang.String _value15 = "REGION METROPOLITANA DE SANTIAGO";
    public static final RegionesValores value1 = new RegionesValores(_value1);
    public static final RegionesValores value2 = new RegionesValores(_value2);
    public static final RegionesValores value3 = new RegionesValores(_value3);
    public static final RegionesValores value4 = new RegionesValores(_value4);
    public static final RegionesValores value5 = new RegionesValores(_value5);
    public static final RegionesValores value6 = new RegionesValores(_value6);
    public static final RegionesValores value7 = new RegionesValores(_value7);
    public static final RegionesValores value8 = new RegionesValores(_value8);
    public static final RegionesValores value9 = new RegionesValores(_value9);
    public static final RegionesValores value10 = new RegionesValores(_value10);
    public static final RegionesValores value11 = new RegionesValores(_value11);
    public static final RegionesValores value12 = new RegionesValores(_value12);
    public static final RegionesValores value13 = new RegionesValores(_value13);
    public static final RegionesValores value14 = new RegionesValores(_value14);
    public static final RegionesValores value15 = new RegionesValores(_value15);
    public java.lang.String getValue() { return _value_;}
    public static RegionesValores fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RegionesValores enumeration = (RegionesValores)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RegionesValores fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RegionesValores.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "regionesValores"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
