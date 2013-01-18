/**
 * InstitucionesValores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InstitucionesValores implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InstitucionesValores(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INP = "INP";
    public static final java.lang.String _IPS = "IPS";
    public static final java.lang.String _SII = "SII";
    public static final java.lang.String _SRCeI = "SRCeI";
    public static final java.lang.String _MINVU = "MINVU";
    public static final java.lang.String _TGR = "TGR";
    public static final java.lang.String _DIRTRA = "DIRTRA";
    public static final java.lang.String _SENCE = "SENCE";
    public static final java.lang.String _ADUANA = "ADUANA";
    public static final java.lang.String _COCHILCO = "COCHILCO";
    public static final java.lang.String _SEGPRES = "SEGPRES";
    public static final java.lang.String _HACIENDA = "HACIENDA";
    public static final java.lang.String _DGAC = "DGAC";
    public static final java.lang.String _SERCIVIL = "SERCIVIL";
    public static final java.lang.String _CONADI = "CONADI";
    public static final java.lang.String _CNR = "CNR";
    public static final java.lang.String _MIDEPLAN = "MIDEPLAN";
    public static final java.lang.String _SERPESCA = "SERPESCA";
    public static final java.lang.String _SUBPESCA = "SUBPESCA";
    public static final java.lang.String _MOP = "MOP";
    public static final java.lang.String _PDI = "PDI";
    public static final java.lang.String _INJUV = "INJUV";
    public static final java.lang.String _DAP = "DAP";
    public static final java.lang.String _MINEDUC = "MINEDUC";
    public static final java.lang.String _CCHEN = "CCHEN";
    public static final java.lang.String _INTEGRA = "INTEGRA";
    public static final java.lang.String _PREREP = "PREREP";
    public static final java.lang.String _CNTV = "CNTV";
    public static final java.lang.String _SERCOTEC = "SERCOTEC";
    public static final java.lang.String _ISP = "ISP";
    public static final java.lang.String _SRASIS = "SRASIS";
    public static final java.lang.String _DIPRECA = "DIPRECA";
    public static final InstitucionesValores INP = new InstitucionesValores(_INP);
    public static final InstitucionesValores IPS = new InstitucionesValores(_IPS);
    public static final InstitucionesValores SII = new InstitucionesValores(_SII);
    public static final InstitucionesValores SRCeI = new InstitucionesValores(_SRCeI);
    public static final InstitucionesValores MINVU = new InstitucionesValores(_MINVU);
    public static final InstitucionesValores TGR = new InstitucionesValores(_TGR);
    public static final InstitucionesValores DIRTRA = new InstitucionesValores(_DIRTRA);
    public static final InstitucionesValores SENCE = new InstitucionesValores(_SENCE);
    public static final InstitucionesValores ADUANA = new InstitucionesValores(_ADUANA);
    public static final InstitucionesValores COCHILCO = new InstitucionesValores(_COCHILCO);
    public static final InstitucionesValores SEGPRES = new InstitucionesValores(_SEGPRES);
    public static final InstitucionesValores HACIENDA = new InstitucionesValores(_HACIENDA);
    public static final InstitucionesValores DGAC = new InstitucionesValores(_DGAC);
    public static final InstitucionesValores SERCIVIL = new InstitucionesValores(_SERCIVIL);
    public static final InstitucionesValores CONADI = new InstitucionesValores(_CONADI);
    public static final InstitucionesValores CNR = new InstitucionesValores(_CNR);
    public static final InstitucionesValores MIDEPLAN = new InstitucionesValores(_MIDEPLAN);
    public static final InstitucionesValores SERPESCA = new InstitucionesValores(_SERPESCA);
    public static final InstitucionesValores SUBPESCA = new InstitucionesValores(_SUBPESCA);
    public static final InstitucionesValores MOP = new InstitucionesValores(_MOP);
    public static final InstitucionesValores PDI = new InstitucionesValores(_PDI);
    public static final InstitucionesValores INJUV = new InstitucionesValores(_INJUV);
    public static final InstitucionesValores DAP = new InstitucionesValores(_DAP);
    public static final InstitucionesValores MINEDUC = new InstitucionesValores(_MINEDUC);
    public static final InstitucionesValores CCHEN = new InstitucionesValores(_CCHEN);
    public static final InstitucionesValores INTEGRA = new InstitucionesValores(_INTEGRA);
    public static final InstitucionesValores PREREP = new InstitucionesValores(_PREREP);
    public static final InstitucionesValores CNTV = new InstitucionesValores(_CNTV);
    public static final InstitucionesValores SERCOTEC = new InstitucionesValores(_SERCOTEC);
    public static final InstitucionesValores ISP = new InstitucionesValores(_ISP);
    public static final InstitucionesValores SRASIS = new InstitucionesValores(_SRASIS);
    public static final InstitucionesValores DIPRECA = new InstitucionesValores(_DIPRECA);
    public java.lang.String getValue() { return _value_;}
    public static InstitucionesValores fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InstitucionesValores enumeration = (InstitucionesValores)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InstitucionesValores fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InstitucionesValores.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "institucionesValores"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
