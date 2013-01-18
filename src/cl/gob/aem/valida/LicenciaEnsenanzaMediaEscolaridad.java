/**
 * LicenciaEnsenanzaMediaEscolaridad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.gob.aem.valida;

public class LicenciaEnsenanzaMediaEscolaridad  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* Último año de escolaridad */
    private org.apache.axis.types.Year agnoEscolar;

    /* Último grado de escolaridad */
    private cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGrado grado;

    /* Código de la enseñanza desarrollada */
    private cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadCodigoEnsenanza codigoEnsenanza;

    /* Glosa de la Enseñanza Desarrollada */
    private cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGlosaEnsenanza glosaEnsenanza;

    /* Situación de termino del curso */
    private cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadSituacionFinal situacionFinal;

    private org.apache.axis.message.MessageElement [] _any;

    public LicenciaEnsenanzaMediaEscolaridad() {
    }

    public LicenciaEnsenanzaMediaEscolaridad(
           org.apache.axis.types.Year agnoEscolar,
           cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGrado grado,
           cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadCodigoEnsenanza codigoEnsenanza,
           cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGlosaEnsenanza glosaEnsenanza,
           cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadSituacionFinal situacionFinal,
           org.apache.axis.message.MessageElement [] _any) {
           this.agnoEscolar = agnoEscolar;
           this.grado = grado;
           this.codigoEnsenanza = codigoEnsenanza;
           this.glosaEnsenanza = glosaEnsenanza;
           this.situacionFinal = situacionFinal;
           this._any = _any;
    }


    /**
     * Gets the agnoEscolar value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @return agnoEscolar   * Último año de escolaridad
     */
    public org.apache.axis.types.Year getAgnoEscolar() {
        return agnoEscolar;
    }


    /**
     * Sets the agnoEscolar value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @param agnoEscolar   * Último año de escolaridad
     */
    public void setAgnoEscolar(org.apache.axis.types.Year agnoEscolar) {
        this.agnoEscolar = agnoEscolar;
    }


    /**
     * Gets the grado value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @return grado   * Último grado de escolaridad
     */
    public cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGrado getGrado() {
        return grado;
    }


    /**
     * Sets the grado value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @param grado   * Último grado de escolaridad
     */
    public void setGrado(cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGrado grado) {
        this.grado = grado;
    }


    /**
     * Gets the codigoEnsenanza value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @return codigoEnsenanza   * Código de la enseñanza desarrollada
     */
    public cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadCodigoEnsenanza getCodigoEnsenanza() {
        return codigoEnsenanza;
    }


    /**
     * Sets the codigoEnsenanza value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @param codigoEnsenanza   * Código de la enseñanza desarrollada
     */
    public void setCodigoEnsenanza(cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadCodigoEnsenanza codigoEnsenanza) {
        this.codigoEnsenanza = codigoEnsenanza;
    }


    /**
     * Gets the glosaEnsenanza value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @return glosaEnsenanza   * Glosa de la Enseñanza Desarrollada
     */
    public cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGlosaEnsenanza getGlosaEnsenanza() {
        return glosaEnsenanza;
    }


    /**
     * Sets the glosaEnsenanza value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @param glosaEnsenanza   * Glosa de la Enseñanza Desarrollada
     */
    public void setGlosaEnsenanza(cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadGlosaEnsenanza glosaEnsenanza) {
        this.glosaEnsenanza = glosaEnsenanza;
    }


    /**
     * Gets the situacionFinal value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @return situacionFinal   * Situación de termino del curso
     */
    public cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadSituacionFinal getSituacionFinal() {
        return situacionFinal;
    }


    /**
     * Sets the situacionFinal value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @param situacionFinal   * Situación de termino del curso
     */
    public void setSituacionFinal(cl.gob.aem.valida.LicenciaEnsenanzaMediaEscolaridadSituacionFinal situacionFinal) {
        this.situacionFinal = situacionFinal;
    }


    /**
     * Gets the _any value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this LicenciaEnsenanzaMediaEscolaridad.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenciaEnsenanzaMediaEscolaridad)) return false;
        LicenciaEnsenanzaMediaEscolaridad other = (LicenciaEnsenanzaMediaEscolaridad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agnoEscolar==null && other.getAgnoEscolar()==null) || 
             (this.agnoEscolar!=null &&
              this.agnoEscolar.equals(other.getAgnoEscolar()))) &&
            ((this.grado==null && other.getGrado()==null) || 
             (this.grado!=null &&
              this.grado.equals(other.getGrado()))) &&
            ((this.codigoEnsenanza==null && other.getCodigoEnsenanza()==null) || 
             (this.codigoEnsenanza!=null &&
              this.codigoEnsenanza.equals(other.getCodigoEnsenanza()))) &&
            ((this.glosaEnsenanza==null && other.getGlosaEnsenanza()==null) || 
             (this.glosaEnsenanza!=null &&
              this.glosaEnsenanza.equals(other.getGlosaEnsenanza()))) &&
            ((this.situacionFinal==null && other.getSituacionFinal()==null) || 
             (this.situacionFinal!=null &&
              this.situacionFinal.equals(other.getSituacionFinal()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAgnoEscolar() != null) {
            _hashCode += getAgnoEscolar().hashCode();
        }
        if (getGrado() != null) {
            _hashCode += getGrado().hashCode();
        }
        if (getCodigoEnsenanza() != null) {
            _hashCode += getCodigoEnsenanza().hashCode();
        }
        if (getGlosaEnsenanza() != null) {
            _hashCode += getGlosaEnsenanza().hashCode();
        }
        if (getSituacionFinal() != null) {
            _hashCode += getSituacionFinal().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenciaEnsenanzaMediaEscolaridad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>LicenciaEnsenanzaMedia>Escolaridad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agnoEscolar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "AgnoEscolar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "Grado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>LicenciaEnsenanzaMedia>Escolaridad>Grado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEnsenanza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "CodigoEnsenanza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>LicenciaEnsenanzaMedia>Escolaridad>CodigoEnsenanza"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glosaEnsenanza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "GlosaEnsenanza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>LicenciaEnsenanzaMedia>Escolaridad>GlosaEnsenanza"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacionFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://valida.aem.gob.cl", "SituacionFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valida.aem.gob.cl", ">>>LicenciaEnsenanzaMedia>Escolaridad>SituacionFinal"));
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
