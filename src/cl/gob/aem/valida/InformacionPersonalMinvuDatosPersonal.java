/**
 * InformacionPersonalMinvuDatosPersonal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class InformacionPersonalMinvuDatosPersonal  extends cl.gob.aem.valida.DatosPersonalMinvuType  implements java.io.Serializable {
    private java.lang.String nacionalidad;

    private java.lang.String paisOrigen;

    public InformacionPersonalMinvuDatosPersonal() {
    }

    public InformacionPersonalMinvuDatosPersonal(
           cl.gob.aem.valida.RunType run,
           cl.gob.aem.valida.NameType nombre,
           cl.gob.aem.valida.FechaType fechaNacimiento,
           cl.gob.aem.valida.FechaType fechaDefuncion,
           cl.gob.aem.valida.EstadoCivilValores estadoCivil,
           cl.gob.aem.valida.SexoValores sexo,
           cl.gob.aem.valida.DiscapacidadType discapacidad,
           java.lang.String nacionalidad,
           java.lang.String paisOrigen) {
        super(
            run,
            nombre,
            fechaNacimiento,
            fechaDefuncion,
            estadoCivil,
            sexo,
            discapacidad);
        this.nacionalidad = nacionalidad;
        this.paisOrigen = paisOrigen;
    }


    /**
     * Gets the nacionalidad value for this InformacionPersonalMinvuDatosPersonal.
     * 
     * @return nacionalidad
     */
    public java.lang.String getNacionalidad() {
        return nacionalidad;
    }


    /**
     * Sets the nacionalidad value for this InformacionPersonalMinvuDatosPersonal.
     * 
     * @param nacionalidad
     */
    public void setNacionalidad(java.lang.String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    /**
     * Gets the paisOrigen value for this InformacionPersonalMinvuDatosPersonal.
     * 
     * @return paisOrigen
     */
    public java.lang.String getPaisOrigen() {
        return paisOrigen;
    }


    /**
     * Sets the paisOrigen value for this InformacionPersonalMinvuDatosPersonal.
     * 
     * @param paisOrigen
     */
    public void setPaisOrigen(java.lang.String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionPersonalMinvuDatosPersonal)) return false;
        InformacionPersonalMinvuDatosPersonal other = (InformacionPersonalMinvuDatosPersonal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nacionalidad==null && other.getNacionalidad()==null) || 
             (this.nacionalidad!=null &&
              this.nacionalidad.equals(other.getNacionalidad()))) &&
            ((this.paisOrigen==null && other.getPaisOrigen()==null) || 
             (this.paisOrigen!=null &&
              this.paisOrigen.equals(other.getPaisOrigen())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNacionalidad() != null) {
            _hashCode += getNacionalidad().hashCode();
        }
        if (getPaisOrigen() != null) {
            _hashCode += getPaisOrigen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionPersonalMinvuDatosPersonal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>informacionPersonalMinvu>datosPersonal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "nacionalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisOrigen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "paisOrigen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
