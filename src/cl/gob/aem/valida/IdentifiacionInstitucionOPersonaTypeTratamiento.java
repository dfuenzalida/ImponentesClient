/**
 * IdentifiacionInstitucionOPersonaTypeTratamiento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class IdentifiacionInstitucionOPersonaTypeTratamiento implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IdentifiacionInstitucionOPersonaTypeTratamiento(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SEÑOR = "SEÑOR";
    public static final java.lang.String _SEÑORA = "SEÑORA";
    public static final java.lang.String _SEÑORES = "SEÑORES";
    public static final java.lang.String _SEÑORAS = "SEÑORAS";
    public static final java.lang.String _SEÑORITA = "SEÑORITA";
    public static final java.lang.String _SEÑORITAS = "SEÑORITAS";
    public static final java.lang.String _ILUSTRE = "ILUSTRE";
    public static final java.lang.String _ILUSTRISIMA = "ILUSTRISIMA";
    public static final java.lang.String _ILUSTRISIMO = "ILUSTRISIMO";
    public static final java.lang.String _EXCELENTISIMA = "EXCELENTISIMA";
    public static final java.lang.String _EXCELENTISIMO = "EXCELENTISIMO";
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento SEÑOR = new IdentifiacionInstitucionOPersonaTypeTratamiento(_SEÑOR);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento SEÑORA = new IdentifiacionInstitucionOPersonaTypeTratamiento(_SEÑORA);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento SEÑORES = new IdentifiacionInstitucionOPersonaTypeTratamiento(_SEÑORES);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento SEÑORAS = new IdentifiacionInstitucionOPersonaTypeTratamiento(_SEÑORAS);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento SEÑORITA = new IdentifiacionInstitucionOPersonaTypeTratamiento(_SEÑORITA);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento SEÑORITAS = new IdentifiacionInstitucionOPersonaTypeTratamiento(_SEÑORITAS);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento ILUSTRE = new IdentifiacionInstitucionOPersonaTypeTratamiento(_ILUSTRE);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento ILUSTRISIMA = new IdentifiacionInstitucionOPersonaTypeTratamiento(_ILUSTRISIMA);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento ILUSTRISIMO = new IdentifiacionInstitucionOPersonaTypeTratamiento(_ILUSTRISIMO);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento EXCELENTISIMA = new IdentifiacionInstitucionOPersonaTypeTratamiento(_EXCELENTISIMA);
    public static final IdentifiacionInstitucionOPersonaTypeTratamiento EXCELENTISIMO = new IdentifiacionInstitucionOPersonaTypeTratamiento(_EXCELENTISIMO);
    public java.lang.String getValue() { return _value_;}
    public static IdentifiacionInstitucionOPersonaTypeTratamiento fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IdentifiacionInstitucionOPersonaTypeTratamiento enumeration = (IdentifiacionInstitucionOPersonaTypeTratamiento)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IdentifiacionInstitucionOPersonaTypeTratamiento fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IdentifiacionInstitucionOPersonaTypeTratamiento.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">IdentifiacionInstitucionOPersonaType>Tratamiento"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
