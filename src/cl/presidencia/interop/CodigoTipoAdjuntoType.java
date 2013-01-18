/**
 * CodigoTipoAdjuntoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.presidencia.interop;

public class CodigoTipoAdjuntoType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CodigoTipoAdjuntoType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "01";
    public static final java.lang.String _value2 = "02";
    public static final java.lang.String _value3 = "03";
    public static final CodigoTipoAdjuntoType value1 = new CodigoTipoAdjuntoType(_value1);
    public static final CodigoTipoAdjuntoType value2 = new CodigoTipoAdjuntoType(_value2);
    public static final CodigoTipoAdjuntoType value3 = new CodigoTipoAdjuntoType(_value3);
    public java.lang.String getValue() { return _value_;}
    public static CodigoTipoAdjuntoType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CodigoTipoAdjuntoType enumeration = (CodigoTipoAdjuntoType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CodigoTipoAdjuntoType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CodigoTipoAdjuntoType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://interop.presidencia.cl", "CodigoTipoAdjuntoType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
