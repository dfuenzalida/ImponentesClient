/**
 * MetodoMessageDigest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class MetodoMessageDigest implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MetodoMessageDigest(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "HAVAL";
    public static final java.lang.String _value2 = "MD2";
    public static final java.lang.String _value3 = "MD4";
    public static final java.lang.String _value4 = "MD5";
    public static final java.lang.String _value5 = "PANAMA";
    public static final java.lang.String _value6 = "RIPEMD";
    public static final java.lang.String _value7 = "RIPEMD-128/256";
    public static final java.lang.String _value8 = "RIPEMD-160/320";
    public static final java.lang.String _value9 = "SHA-0";
    public static final java.lang.String _value10 = "SHA-1";
    public static final java.lang.String _value11 = "SHA-256/224";
    public static final java.lang.String _value12 = "Tiger(2)-192/160/128";
    public static final java.lang.String _value13 = "WHIRLPOOL";
    public static final MetodoMessageDigest value1 = new MetodoMessageDigest(_value1);
    public static final MetodoMessageDigest value2 = new MetodoMessageDigest(_value2);
    public static final MetodoMessageDigest value3 = new MetodoMessageDigest(_value3);
    public static final MetodoMessageDigest value4 = new MetodoMessageDigest(_value4);
    public static final MetodoMessageDigest value5 = new MetodoMessageDigest(_value5);
    public static final MetodoMessageDigest value6 = new MetodoMessageDigest(_value6);
    public static final MetodoMessageDigest value7 = new MetodoMessageDigest(_value7);
    public static final MetodoMessageDigest value8 = new MetodoMessageDigest(_value8);
    public static final MetodoMessageDigest value9 = new MetodoMessageDigest(_value9);
    public static final MetodoMessageDigest value10 = new MetodoMessageDigest(_value10);
    public static final MetodoMessageDigest value11 = new MetodoMessageDigest(_value11);
    public static final MetodoMessageDigest value12 = new MetodoMessageDigest(_value12);
    public static final MetodoMessageDigest value13 = new MetodoMessageDigest(_value13);
    public java.lang.String getValue() { return _value_;}
    public static MetodoMessageDigest fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MetodoMessageDigest enumeration = (MetodoMessageDigest)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MetodoMessageDigest fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MetodoMessageDigest.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "metodoMessageDigest"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
